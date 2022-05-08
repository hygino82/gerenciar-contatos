package com.contacts.mylist.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.mylist.dto.ContactDTO;
import com.contacts.mylist.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<ContactDTO> findAllContacts() {

		var contactList = contactRepository.findAll();
		List<ContactDTO> contactListDTO = new ArrayList<>();

		contactList.forEach(contact -> contactListDTO.add(mapper.map(contact, ContactDTO.class)));

		return contactListDTO;
	}

}

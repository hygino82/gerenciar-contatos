package com.contacts.mylist.service;

import java.util.List;

import com.contacts.mylist.dto.ContactDTO;

public interface ContactService {

	List<ContactDTO> findAllContacts();

	ContactDTO addContact(ContactDTO contactDTO);

	ContactDTO findContactById(long id);

	List<ContactDTO> findAllContactsByFirstName(String firstName);
	List<ContactDTO> findAllContactsByLastName(String lastName);

}

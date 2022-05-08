package com.contacts.mylist.service;

import java.util.List;

import com.contacts.mylist.dto.ContactDTO;

public interface ContactService {

	List<ContactDTO> findAllContacts();

	ContactDTO addContact(ContactDTO contactDTO);

}

package com.contacts.mylist.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.mylist.dto.ContactDTO;
import com.contacts.mylist.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping
	public List<ContactDTO> findAllContacts() {
		return contactService.findAllContacts();
	}

	@PostMapping
	public ContactDTO addContact(@RequestBody ContactDTO contactDTO) {
		return contactService.addContact(contactDTO);
	}

	@GetMapping("/{id}")
	public ContactDTO findContactById(@PathVariable("id") long id) {
		return contactService.findContactById(id);
	}

	@GetMapping("/firstname")
	public List<ContactDTO> findAllContactsByFirstName(@PathParam(value = "firstName") String firstName) {
		return contactService.findAllContactsByFirstName(firstName);
	}

	@GetMapping("/lastname")
	public List<ContactDTO> findAllContactsByLastName(@PathParam(value = "lastName") String lastName) {
		return contactService.findAllContactsByLastName(lastName);
	}
}

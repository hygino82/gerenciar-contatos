package com.contacts.mylist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<ContactDTO> findAllContacts(){
		return contactService.findAllContacts();
	}
}

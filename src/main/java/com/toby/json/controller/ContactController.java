package com.toby.json.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toby.json.domain.Contact;
import com.toby.json.service.ContactService;

@CrossOrigin
@RestController
@RequestMapping("${endpoint.base}")
public class ContactController {

	private ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@GetMapping("${endpoint.get}")
	public Iterable<Contact> getAllContacts() {
		return contactService.getAllContacts();
	}

}

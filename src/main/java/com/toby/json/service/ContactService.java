package com.toby.json.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.toby.json.domain.Contact;
import com.toby.json.repository.ContactRepo;

@Service
public class ContactService {

	private ContactRepo contactRepo;

	public ContactService(ContactRepo contactRepo) {
		this.contactRepo = contactRepo;
	}

	public Iterable<Contact> getAllContacts() {
		return contactRepo.findAll();
	}

	public Iterable<Contact> saveListOfContacts(List<Contact> contactList) {
		return contactRepo.saveAll(contactList);
	}

}

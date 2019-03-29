package com.toby.json.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.toby.json.domain.Contact;

@Repository
public interface ContactRepo extends CrudRepository<Contact, String>{

}

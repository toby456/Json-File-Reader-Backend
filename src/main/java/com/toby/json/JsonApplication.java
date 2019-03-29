package com.toby.json;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toby.json.service.ContactService;
import com.toby.json.constants.Constants;
import com.toby.json.domain.Contact;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ContactService contactService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Contact>> typeReference = new TypeReference<List<Contact>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream(Constants.JSON_LOCATION);
			try {
				List<Contact> users = mapper.readValue(inputStream, typeReference);
				contactService.saveListOfContacts(users);
				System.out.println(Constants.CONTACTS_SAVED);
			} catch (IOException e) {
				System.out.println(Constants.CONTACTS_NOT_SAVED + e.getMessage());
			}
		};
	}

}

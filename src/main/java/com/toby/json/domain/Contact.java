package com.toby.json.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Contact {
	@ElementCollection
	private List<String> job_history;
	private String company;
	private String email;
	private String city;
	@Id
	private String name;
	private String country;

	public Contact() {

	}

	public List<String> getJob_history() {
		return job_history;
	}

	public void setJob_history(List<String> job_history) {
		this.job_history = job_history;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

}

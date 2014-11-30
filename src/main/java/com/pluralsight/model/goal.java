package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

@Entity
public class goal {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Range(min=1, max=120)
	private String minutes;
	
	public Long getId() {
		return id;
	}

	public String getMinutes() {
		return minutes;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	
}

package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class goal {
	
	@Range(min=1, max=120)
	private String minutes;

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	
}

package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="goals")
public class goal{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Range(min=1, max=120)
	@Column(name="minutes")
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

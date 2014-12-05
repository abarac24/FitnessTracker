package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Range(min=1, max=120)
	private int minutes;

	@Range(min=1, max=120)
	private int seconds;

	@NotNull
	private String activity;	
	
	@ManyToOne()
	private goal goal;
	
	public String getActivity() {
		return activity;
	}

	public goal getGoal() {
		return goal;
	}

	public Long getId() {
		return id;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setGoal(goal goal) {
		this.goal = goal;
	}
  
	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
}

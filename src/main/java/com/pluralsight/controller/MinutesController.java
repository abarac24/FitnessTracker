package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.services.ExrciseServicesImpl;

import java.util.List;

@Controller  
public class MinutesController {
	
	@Autowired
	private ExrciseServicesImpl exerciseservices;
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes( @ModelAttribute("exercise") Exercise exercise ){
		
		System.out.println("Exercise: " + exercise.getMinutes());
		System.out.println("------------------------------------------");
		System.out.println("Seconds: " + exercise.getSeconds());
		
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findActivities(){
		return exerciseservices.findActivities();
	}
	
	/*@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes( @ModelAttribute("exercise") Exercise exercise ){
		
		System.out.println("Exercising: " + exercise.getMinutes());
		System.out.println("------------------------------------------");
		System.out.println("Seconds: " + exercise.getSeconds());
		
		return "addMinutes";
	}
	*/
}

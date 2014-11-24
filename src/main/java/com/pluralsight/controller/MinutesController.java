package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

import java.util.ArrayList;
import java.util.List;

@Controller  
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes( @ModelAttribute("exercise") Exercise exercise ){
		
		System.out.println("Exercise: " + exercise.getMinutes());
		System.out.println("------------------------------------------");
		System.out.println("Seconds: " + exercise.getSeconds());
		
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findActivities(){
		
		List<Activity> list = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Test 1");
		list.add(run);
		
		Activity run1 = new Activity();
		run1.setDesc("Test 2");
		list.add(run1);
		
		Activity run2 = new Activity();
		run2.setDesc("Test 3");
		list.add(run2);
		
		return list;
		
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

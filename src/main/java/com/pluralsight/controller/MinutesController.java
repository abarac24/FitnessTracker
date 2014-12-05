package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.model.goal;
import com.pluralsight.services.ExerciseService;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller  
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseservice;
	
	@RequestMapping(value="/addMinutes", method=RequestMethod.GET)
	public String addMinutes( @ModelAttribute("exercise") Exercise exercise ){
		return "addMinutes";
	}
	
	
	@RequestMapping(value="/addMinutes", method=RequestMethod.POST)
	public String addMoreMinutes( @Valid @ModelAttribute("exercise") Exercise exercise, HttpSession session, BindingResult result ){
		
		System.out.println("Exercising: " + exercise.getMinutes());
		System.out.println("------------------------------------------");
		System.out.println("Seconds: " + exercise.getSeconds());
		
		if( result.hasErrors() ){
			return "addMinutes";
		}else{
			goal goal = (goal) session.getAttribute("goal");
			exercise.setGoal(goal);
			
			exerciseservice.save( exercise );
		}
		
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findActivities(){
		return exerciseservice.findActivities();
	}
	
}

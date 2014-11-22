package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.goal;

@Controller
public class GoalController {
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal( Model model ){
		
		model.addAttribute("goal", new goal() );
		
		return "addGoal";
	}
	
}

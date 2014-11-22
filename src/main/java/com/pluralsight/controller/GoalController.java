package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.goal;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal( Model model ){
		
		goal goal = new goal();
		goal.setMinutes("35");
		model.addAttribute("goal", goal );
		
		return "addGoal";
	}
	
	@RequestMapping(value="addGoal", method=RequestMethod.POST)
	public String updateGoal( @ModelAttribute("goal") goal goal ){
		
		System.out.println("inutes Updates: " + goal.getMinutes());
		return "redirect:addMinutes";
	}
	
}

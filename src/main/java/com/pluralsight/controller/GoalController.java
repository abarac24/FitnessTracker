package com.pluralsight.controller;

import javax.validation.Valid;
import javax.xml.ws.Service.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import antlr.collections.List;

import com.pluralsight.model.goal;
import com.pluralsight.services.GoalService;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@Autowired
	private GoalService goalService;
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal( Model model ){
		
		goal goal = new goal();
		goal.setMinutes("35");
		model.addAttribute("goal", goal );
		
		return "addGoal";
	}
	 
	@RequestMapping( value="addGoal", method=RequestMethod.POST)
	public String updateGoal( @Valid @ModelAttribute("goal") goal goal, BindingResult result ){
		 
		System.out.println("Errors: " + result.hasErrors());
		
		System.out.println("inutes Updates: " + goal.getMinutes());
		
		
		if( result.hasErrors() ){
			return "addGoal";
		}else{
			goalService.save(goal);
		}
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="/getGoals", method=RequestMethod.GET)
	public String getGoals( Model model ){
		
		java.util.List<goal> goals = this.goalService.findAllGoals();			
		model.addAttribute("goals", goals);		
		return "getGoals";
	}	
}

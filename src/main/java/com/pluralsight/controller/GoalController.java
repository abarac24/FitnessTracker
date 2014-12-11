package com.pluralsight.controller;

import javax.validation.Valid;
import javax.websocket.Session;
import javax.xml.ws.Service.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.pluralsight.model.GoalReport;
import com.pluralsight.model.goal;
import com.pluralsight.services.GoalService;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@Autowired
	private GoalService goalService;
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal( Model model, HttpSession session ){
		
		goal goal = (goal) session.getAttribute("goal");
		
		if( goal == null )
		{
			goal = new goal();
			goal.setMinutes("10");
		}
		
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
	
	@RequestMapping(value="/getGoalsReports", method=RequestMethod.GET)
	public String getGoalsReports( Model model ){
		
		java.util.List<GoalReport> goalReports = this.goalService.findAllGoalsReports();			
		model.addAttribute("goalReports", goalReports);
		
		return "getGoalReports";
	}	
}

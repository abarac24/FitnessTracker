package com.pluralsight.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import antlr.collections.List;

import com.pluralsight.model.GoalReport;
import com.pluralsight.model.goal;
import com.pluralsight.repository.GoalRepository;

@Service("GoalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public goal save(goal goal) {
		return goalRepository.save(goal);
	}
	
	public java.util.List<goal> findAllGoals(){
		return goalRepository.loadAll();		
	}

	public java.util.List<GoalReport> findAllGoalsReports() {
		return goalRepository.loadAllGoalReports();	
	}
}

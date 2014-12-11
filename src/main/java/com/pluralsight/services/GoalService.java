package com.pluralsight.services;

import java.util.List;

import com.pluralsight.model.GoalReport;
import com.pluralsight.model.goal;

public interface GoalService {

	goal save( goal goal );
	java.util.List<goal> findAllGoals();
	List<GoalReport> findAllGoalsReports();
}

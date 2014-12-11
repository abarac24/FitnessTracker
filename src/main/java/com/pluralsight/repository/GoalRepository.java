package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.GoalReport;
import com.pluralsight.model.goal;

public interface GoalRepository {
	goal save(goal goal);
	List<goal> loadAll();
	List<GoalReport> loadAllGoalReports();
}

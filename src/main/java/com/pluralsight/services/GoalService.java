package com.pluralsight.services;

import com.pluralsight.model.goal;

public interface GoalService {

	goal save( goal goal );
	java.util.List<goal> findAllGoals();
}

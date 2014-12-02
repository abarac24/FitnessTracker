package com.pluralsight.services;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

public interface ExerciseService {

	List<Activity> findActivities();

	Exercise save(Exercise exercise);

}
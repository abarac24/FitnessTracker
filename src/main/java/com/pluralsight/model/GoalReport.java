package com.pluralsight.model;

public class GoalReport {
	
	private String goalMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;
	
	public GoalReport(){
		
	}
	
	public GoalReport( String goalMinutes, int exerciseMinutes, String exerciseActivity ){
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}
	
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	
	public String getGoalMinutes() {
		return goalMinutes;
	}
	
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}

	public void setGoalMinutes(String goalMinutes) {
		this.goalMinutes = goalMinutes;
	}

}

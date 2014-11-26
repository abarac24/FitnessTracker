package com.pluralsight.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.pluralsight.model.Activity;

@Service("exrciseServices")
public class ExrciseServicesImpl implements ExerciseServices {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.services.ExerciseServicesInterface#findActivities()
	 */
	public List<Activity> findActivities(){
		
		List<Activity> list = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Test 1");
		list.add(run);
		
		Activity run1 = new Activity();
		run1.setDesc("Test 2");
		list.add(run1);
		
		Activity run2 = new Activity();
		run2.setDesc("Test 3");
		list.add(run2);
		
		return list;
		
	}
	
}

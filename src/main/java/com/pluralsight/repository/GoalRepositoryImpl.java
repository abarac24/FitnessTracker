package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.GoalReport;
import com.pluralsight.model.goal;

@Repository("GoalRepository")
public class GoalRepositoryImpl implements GoalRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public goal save(goal goal){
		
		if( goal.getId() == null ){
			em.persist(goal);
			em.flush();
		}else{
			goal = em.merge( goal );
		}
		
		return goal;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<goal> loadAll() {
		
		/*
		 * goal is a name of model entity object
		 * 
		 * */
		Query query = em.createQuery("Select g from goal g");		
		List goals = query.getResultList();		
		return goals;
	}
	 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<GoalReport> loadAllGoalReports() {
		
		/*
		 * Using Named Query
		 * commented String Query
		 * */
		/*Query query = em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " + 												
									 "from goal g, Exercise e where g.id = e.goal.id");	*/		
		
		TypedQuery<GoalReport> query = em.createNamedQuery(goal.FIND_GOAL_REPORTS, GoalReport.class);
		
		List goalReports = query.getResultList();			
		return goalReports;
	}
}

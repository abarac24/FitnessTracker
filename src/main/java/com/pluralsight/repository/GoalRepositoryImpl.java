package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.goal;

@Repository("GoalRepository")
public class GoalRepositoryImpl implements GoalRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public goal save(goal goal){
		
		em.persist(goal);
		em.flush();
		
		
		return goal;
	}
}

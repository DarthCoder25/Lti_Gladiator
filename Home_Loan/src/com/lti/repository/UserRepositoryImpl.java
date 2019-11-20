package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.UserDetail;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository 
{
@PersistenceContext
	EntityManager em;
	

	
	@Override
	@Transactional
	public UserDetail addUser(UserDetail ud) {
//		ud=em.merge(ud);
		em.persist(ud);
		return ud;
	}

	
}



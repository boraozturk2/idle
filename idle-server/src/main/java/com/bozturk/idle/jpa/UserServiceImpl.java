package com.bozturk.idle.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private UserRepository repository;
	
	@Override
	@Transactional
	public User save(User user) {
/*
		if (user.getId() == null) {
			em.persist(user);
			return user;
		} else {
			return em.merge(user);
		}
		*/
		return repository.save(user);
	}

}

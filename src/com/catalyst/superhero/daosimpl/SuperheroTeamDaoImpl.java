package com.catalyst.superhero.daosimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superhero.daos.SuperheroTeamDao;
import com.catalyst.superhero.entities.SuperheroTeam;

@Repository
@Transactional
public class SuperheroTeamDaoImpl implements SuperheroTeamDao {
	@PersistenceContext
	private EntityManager em;
	
	//sets up EntityManager for general hibernate functionality
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	@Override
	public List<SuperheroTeam> getAllSuperherTeams() {
		return em.createQuery("SELECT e FROM SuperheroTeam e", SuperheroTeam.class).
				getResultList();
	}

	@Override
	public void addNewSuperheroTeam(SuperheroTeam superheroTeam) {
		em.persist(superheroTeam);
	}
}

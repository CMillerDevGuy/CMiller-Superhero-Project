package com.catalyst.superhero.daosimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superhero.daos.SuperheroDao;
import com.catalyst.superhero.entities.Superhero;

@Repository
@Transactional
public class SuperheroDaoImpl implements SuperheroDao {
	@PersistenceContext
	private EntityManager em;
	
	//sets up EntityManager for general hibernate functionality
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	@Override
	public List<Superhero> getAllSuperheroes() {
		return em.createQuery("SELECT e FROM Superhero e", Superhero.class).
				getResultList();
	}

	@Override
	public void addNewSuperhero(Superhero superhero) {
			em.persist(superhero);
	}
}

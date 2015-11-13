package com.catalyst.superhero.daosimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.entities.Power;

@Repository
@Transactional
public class PowerDaoImpl implements PowerDao {
	@PersistenceContext
	private EntityManager em;
	
	//sets up EntityManager for general hibernate functionality
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	@Override
	public List<Power> getAllPowers() {
			return em.createQuery("SELECT e FROM Power e", Power.class).
					getResultList();
	}

	@Override
	public void addPower(Power power) {
		em.persist(power);
		
	}

	@Override
	public void updatePowerById(Power power) {
		em.merge(power);
		
	}
}

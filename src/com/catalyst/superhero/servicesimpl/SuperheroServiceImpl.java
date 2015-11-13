package com.catalyst.superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superhero.daos.SuperheroDao;
import com.catalyst.superhero.entities.Superhero;
import com.catalyst.superhero.services.SuperheroService;

@Service
public class SuperheroServiceImpl implements SuperheroService {
	@Autowired
	SuperheroDao superheroDao;

	@Override
	public List<Superhero> getAllSuperheroes() {
		return superheroDao.getAllSuperheroes();
	}

	@Override
	public void addNewSuperhero(Superhero superhero) {
		superheroDao.addNewSuperhero(superhero);
		
	}

}

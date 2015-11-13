package com.catalyst.superhero.services;

import java.util.List;

import com.catalyst.superhero.entities.Superhero;

public interface SuperheroService {

	List<Superhero> getAllSuperheroes();

	public void addNewSuperhero(Superhero superhero);

}

package com.catalyst.superhero.daos;

import java.util.List;

import com.catalyst.superhero.entities.Superhero;

public interface SuperheroDao {

	List<Superhero> getAllSuperheroes();

	void addNewSuperhero(Superhero superhero);

}

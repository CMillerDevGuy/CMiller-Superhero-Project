package com.catalyst.superhero.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superhero.entities.Superhero;
import com.catalyst.superhero.services.SuperheroService;

@RestController
public class SuperheroController {
	@Autowired
	SuperheroService superheroService;
	
	@RequestMapping(value="/superhero", method=RequestMethod.GET)
	public List<Superhero> getAllSuperheroes(){
		return superheroService.getAllSuperheroes();
	}
	
	@RequestMapping(value="/superhero", method=RequestMethod.POST)
	public void addNewSuperhero(@RequestBody Superhero superhero){
		superheroService.addNewSuperhero(superhero);
	}

}

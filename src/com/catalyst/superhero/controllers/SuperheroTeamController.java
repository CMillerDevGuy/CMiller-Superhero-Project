package com.catalyst.superhero.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superhero.entities.Superhero;
import com.catalyst.superhero.entities.SuperheroTeam;
import com.catalyst.superhero.services.SuperheroTeamService;

@RestController
public class SuperheroTeamController {
	@Autowired
	SuperheroTeamService superheroTeamService;

	
	@RequestMapping(value="/superheroTeam", method=RequestMethod.GET)
	public List<SuperheroTeam> getAllSuperheroes(){
		return superheroTeamService.getAllSuperheroTeams();
	}
	
	@RequestMapping(value="/superheroTeam", method=RequestMethod.POST)
	public void addNewSuperhero(@RequestBody SuperheroTeam superheroTeam){
		superheroTeamService.addNewSuperheroTeam(superheroTeam);
	}
}

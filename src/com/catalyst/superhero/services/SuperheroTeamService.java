package com.catalyst.superhero.services;

import java.util.List;

import com.catalyst.superhero.entities.SuperheroTeam;

public interface SuperheroTeamService {

	List<SuperheroTeam> getAllSuperheroTeams();

	void addNewSuperheroTeam(SuperheroTeam superheroTeam);

}

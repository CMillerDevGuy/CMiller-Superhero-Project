package com.catalyst.superhero.daos;

import java.util.List;

import com.catalyst.superhero.entities.SuperheroTeam;

public interface SuperheroTeamDao {

	List<SuperheroTeam> getAllSuperherTeams();

	void addNewSuperheroTeam(SuperheroTeam superheroTeam);

}

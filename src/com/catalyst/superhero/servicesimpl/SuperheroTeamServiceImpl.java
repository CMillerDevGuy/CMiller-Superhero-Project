package com.catalyst.superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superhero.daos.SuperheroTeamDao;
import com.catalyst.superhero.entities.SuperheroTeam;
import com.catalyst.superhero.services.SuperheroTeamService;
@Service
public class SuperheroTeamServiceImpl implements SuperheroTeamService {
	@Autowired
	SuperheroTeamDao superheroTeamDao;

	@Override
	public List<SuperheroTeam> getAllSuperheroTeams() {
		return superheroTeamDao.getAllSuperherTeams();
	}

	@Override
	public void addNewSuperheroTeam(SuperheroTeam superheroTeam) {
		superheroTeamDao.addNewSuperheroTeam(superheroTeam);
		
	}
}

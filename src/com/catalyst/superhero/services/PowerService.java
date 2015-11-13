package com.catalyst.superhero.services;

import java.util.List;

import com.catalyst.superhero.entities.Power;

public interface PowerService {

	List<Power> getAllPowers();

	void addPower(Power power);

	void updatePowerById(Power power);

}

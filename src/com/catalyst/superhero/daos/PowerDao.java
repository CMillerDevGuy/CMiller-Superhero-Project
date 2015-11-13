package com.catalyst.superhero.daos;

import java.util.List;

import com.catalyst.superhero.entities.Power;

public interface PowerDao {

	List<Power> getAllPowers();

	void addPower(Power power);

	void updatePowerById(Power power);

}

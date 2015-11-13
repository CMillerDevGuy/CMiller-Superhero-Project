package com.catalyst.superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.services.PowerService;

@Service
public class PowerServiceImpl implements PowerService {
	@Autowired
	PowerDao powerDao;

	@Override
	public List<Power> getAllPowers() {
		return powerDao.getAllPowers();
	}

	@Override
	public void addPower(Power power) {
		powerDao.addPower(power);
		
	}

	@Override
	public void updatePowerById(Power power) {
		powerDao.updatePowerById(power);
		
	}

}

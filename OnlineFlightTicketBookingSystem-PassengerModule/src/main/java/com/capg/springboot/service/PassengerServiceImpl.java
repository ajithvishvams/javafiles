package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Passenger;
import com.capg.springboot.exceptions.PassengerNotFoundException;
import com.capg.springboot.repository.PassengerRepository;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	@Autowired 
	private PassengerRepository passengerrepository;
	
	@Override
	public Passenger addPassenger(Passenger add) {
		
		passengerrepository.save(add);
	return add;
	}
	
	@Override
	public Passenger removePassenger(Passenger add) {
		
		passengerrepository.save(add);
	return add;
	}
	
	@Override
	public Passenger updatePassenger(Passenger add) {
		
		passengerrepository.save(add);
	return add;
	}
	
}





/*
@Override
public Passenger viewPassengeBy(int id) throws PassengerNotFoundException {
	Passenger add=passengerrepository.findByPassengerId(id);
        if(add==null)
        	throw new PassengerNotFoundException("Passenger NotFound ");
    return add;
}

@Override
public List<Passenger> viewAllPassenger() throws PassengerNotFoundException  {
	List<Passenger> passenger_view = passengerrepository.findAll();
	return passenger_view;
}
*/

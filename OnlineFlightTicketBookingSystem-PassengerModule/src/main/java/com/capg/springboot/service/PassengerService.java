package com.capg.springboot.service;

import java.util.List;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.exceptions.PassengerNotFoundException;

public interface PassengerService {

	public Passenger addPassenger(Passenger add);
	public Passenger removePassenger(Passenger add);
	public Passenger updatePassenger(Passenger add);
	
}










/*
public Passenger viewPassengerBy(int add) throws PassengerNotFoundException;
public List<Passenger> viewAllPassenger() throws PassengerNotFoundException;
*/



/*/*****************************************************************************
 * IPassenger Service Class
 * 
 * Created By: Ajithvishva M S
 * Date:17/03/2022 
 *******************************************************************************/
package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.exceptions.PassengerNotFoundException;
import com.capg.springboot.service.IPassengerService;



@RestController
@RequestMapping("/addPassenger")
public class IPassengerController {

	@Autowired
	private IPassengerService ipassengerservice;
	
	@PostMapping("/addPassenger")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger add){
		ipassengerservice.addPassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	@DeleteMapping("/removePassenger")
	public ResponseEntity<Passenger> removePassenger(@RequestBody Passenger add){
		ipassengerservice.removePassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	@PutMapping("/updatePassenger")
	public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger add){
		ipassengerservice.updatePassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	@GetMapping("/viewPassengerBy/{id}")
	public ResponseEntity<Passenger> viewAddressBy(@PathVariable String id )throws PassengerNotFoundException{
		Passenger passenger=ipassengerservice.viewPassengerBy(id);
		return new ResponseEntity(passenger,HttpStatus.OK);
 	}
	@GetMapping("/viewAllPassenger")
	public ResponseEntity<List<Passenger>> viewAllAddress() throws PassengerNotFoundException {
		List<Passenger> passenger_viewall = ipassengerservice.viewAllPassenger();
		return new ResponseEntity(passenger_viewall,HttpStatus.OK);
	}
}


package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.exception.InvalidDestinationException;
import com.cts.eezee.exception.InvalidSourceException;
import com.cts.eezee.exception.InvalidVehicleTypeException;
import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public void getBookingDetails(Booking booking) {
		//Your Code here...


		
	}

	
	public int getCostPerKM(String vehicleType) throws InvalidVehicleTypeException {
		//Your Code here...


	}
	
	public double getDistance(String destination) throws InvalidDestinationException {
		//Your Code here...

	}

	public boolean transportAvailablity(String vehicleType, String source, String destination, Date date)
			throws InvalidDestinationException, InvalidSourceException, InvalidVehicleTypeException {

		//Your Code here...

	}

	public void calculateTravelCost(int costPerKM, double distance, Date doj) {
		//Your Code here...


}

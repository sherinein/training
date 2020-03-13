package com.cts.eezee.model;

import java.util.Map;

public class Vehicle {
	private Map<String, Integer> costPerKm;
	private String source;
	private Map<String, Double> distance ;
	private double totalCost;
	private String serviceStatus;
	
	public Map<String, Integer> getCostPerKm() {
		return costPerKm;
	}
	public void setCostPerKm(Map<String, Integer> costPerKm) {
		this.costPerKm = costPerKm;
	}
	public Map<String, Double> getDistance() {
		return distance;
	}
	public void setDistance(Map<String, Double> distance) {
		this.distance = distance;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

}

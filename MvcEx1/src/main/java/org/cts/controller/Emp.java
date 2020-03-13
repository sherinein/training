package org.cts.controller;

import javax.validation.constraints.NotNull;

public class Emp {
	@NotNull(message="name is required")
	private String name;
	@NotNull(message="address is required")
	private String address;
	@NotNull(message="mobileno is required")
	private Long mobileNo;
	private String dob;
	public Emp() {
		
	}
	public Emp(String name, String address, Long mobileNo, String dob) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}

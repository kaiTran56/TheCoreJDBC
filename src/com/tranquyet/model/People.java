package com.tranquyet.model;

import java.util.Date;

public class People {
	private String id;
	private String name;
	private Date dob;
	private String address;

	public People() {

	}

	public People(String id, String name, Date dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Id: " + this.id + "\nName: " + this.name + "\nDob: " + this.dob + "\nAddress: " + this.address;
	}

}

package com.oop.model;

public class user {
	private String nic;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	private String address;
	private String password;
	private String departure;
	private String arrive;
	private String date;
	private String tripId;
	
	
	public user(String nic, String fname, String lname, String mobile, String email, String address, String password,
			String departure, String arrive, String date, String tripId) {
		
		super();
		this.nic = nic;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.password = password;
		this.departure = departure;
		this.arrive = arrive;
		this.date = date;
		this.tripId = tripId;
	}


	public String getNic() {
		return nic;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getMobile() {
		return mobile;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	public String getPassword() {
		return password;
	}


	public String getDeparture() {
		return departure;
	}


	public String getArrive() {
		return arrive;
	}


	public String getDate() {
		return date;
	}


	public String getTripId() {
		return tripId;
	}

	

}

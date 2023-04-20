package com.geekster.usermanagment.model;

public class User {
	
	private String userId;
	
	private String name;
	private String userName;
	private String address;
	private String phNumber;
	
	
	public User(String userId, String name, String address, String phNumber) {
	
		this.userId = userId;
		
		this.name = name;
		this.userName = this.name+""+this.userId;
		this.address = address;
		this.phNumber = phNumber;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
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


	public String getPhNumber() {
		return phNumber;
	}


	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	
	
	

}

package com.training.demo.entity;

public class EnterData {
	private String dateEnter;
	private String dateTimeEnter;
	private String ipUser;
	
	public EnterData() {}
	
	public EnterData(String dateEnter, String dateTimeEnter, String ipUser) {
		this.dateEnter = dateEnter;
		this.dateTimeEnter = dateTimeEnter;
		this.ipUser = ipUser;
	}

	public String getDateEnter() {
		return dateEnter;
	}

	public void setDateEnter(String dateEnter) {
		this.dateEnter = dateEnter;
	}

	public String getDateTimeEnter() {
		return dateTimeEnter;
	}

	public void setDateTimeEnter(String dateTimeEnter) {
		this.dateTimeEnter = dateTimeEnter;
	}

	public String getIpUser() {
		return ipUser;
	}

	public void setIpUser(String ipUser) {
		this.ipUser = ipUser;
	}
	
	
}

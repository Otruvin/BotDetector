package com.training.demo.entity;

public class EnterTestPageInfo {
	private String mapping;
	private String ipUser;
	
	public EnterTestPageInfo() {}
	
	public EnterTestPageInfo(String mapping, String ipUser) {
		this.mapping = mapping;
		this.ipUser = ipUser;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public String getIpUser() {
		return ipUser;
	}

	public void setIpUser(String ipUser) {
		this.ipUser = ipUser;
	}
	
	
	
}

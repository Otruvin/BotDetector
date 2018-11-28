package com.training.demo.entity;

public class MousePositionData {
	private String pageName;
	private double mouseCoordX;
	private double mouseCoordY;
	private String ipClient;
	
	public MousePositionData() {}
	
	public MousePositionData(String pageName, double mouseCoordX, double mouseCoordY, String ipClient) {
		this.pageName = pageName;
		this.mouseCoordX = mouseCoordX;
		this.mouseCoordY = mouseCoordY;
		this.ipClient = ipClient;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public double getMouseCoordX() {
		return mouseCoordX;
	}

	public void setMouseCoordX(double mouseCoordX) {
		this.mouseCoordX = mouseCoordX;
	}

	public double getMouseCoordY() {
		return mouseCoordY;
	}

	public void setMouseCoordY(double mouseCoordY) {
		this.mouseCoordY = mouseCoordY;
	}

	public String getIpClient() {
		return ipClient;
	}

	public void setIpClient(String ipClient) {
		this.ipClient = ipClient;
	}
	
	
}

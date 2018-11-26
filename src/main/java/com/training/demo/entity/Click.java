package com.training.demo.entity;

public class Click {
	private String namePage;
	private String nameBanner;
	private String heightBanner;
	private String widthBanner;
	private String clickedCoordX;
	private String clickedCoordY;
	private String ipClient;
	
	public Click() {}
	
	public Click(String namePage, 
			String nameBanner, 
			String heightBanner, 
			String widthBanner, 
			String clickedCoordX,
			String clickedCoordY,
			String ipClient) {
		this.namePage = namePage;
		this.nameBanner = nameBanner;
		this.heightBanner = heightBanner;
		this.widthBanner = widthBanner;
		this.clickedCoordX = clickedCoordX;
		this.clickedCoordY = clickedCoordY;
		this.ipClient = ipClient;
	}

	public String getNamePage() {
		return namePage;
	}

	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}

	public String getNameBanner() {
		return nameBanner;
	}

	public void setNameBanner(String nameBanner) {
		this.nameBanner = nameBanner;
	}

	public String getHeightBanner() {
		return heightBanner;
	}

	public void setHeightBanner(String heightBanner) {
		this.heightBanner = heightBanner;
	}

	public String getWidthBanner() {
		return widthBanner;
	}

	public void setWidthBanner(String widthBanner) {
		this.widthBanner = widthBanner;
	}

	public String getClickedCoordX() {
		return clickedCoordX;
	}

	public void setClickedCoordX(String clickedCoordX) {
		this.clickedCoordX = clickedCoordX;
	}

	public String getClickedCoordY() {
		return clickedCoordY;
	}

	public void setClickedCoordY(String clickedCoordY) {
		this.clickedCoordY = clickedCoordY;
	}
	
	public void setIpClient(String ipClient) {
		this.ipClient = ipClient;
	}
	
	public String getIpClient() {
		return ipClient;
	}

}

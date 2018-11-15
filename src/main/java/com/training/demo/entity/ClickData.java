package com.training.demo.entity;

public class ClickData {
	private String page;
	private String idClickedBlock;
	private double heightBanner;
	private double widthBanner;
	private double clickCoordX;
	private double clickCoordY;
	
	public ClickData(String page, String idClickedBlock, double heightBanner, double widthBanner, double clickCoordX,
			double clickCoordY) {
		super();
		this.page = page;
		this.idClickedBlock = idClickedBlock;
		this.heightBanner = heightBanner;
		this.widthBanner = widthBanner;
		this.clickCoordX = clickCoordX;
		this.clickCoordY = clickCoordY;
	}
	
	

}

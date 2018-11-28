package com.training.demo.entity;

public class User {
	private String ipUser;
	private String browserCodeName;
	private String browserName;
	private String brouserVersion;
	private boolean cookiesEnabled;
	private String browserLanguage;
	private boolean browserOnline;
	private String platform;
	private String userAgentHeader;
	
	public User() {}
	
	public User(String ipUser, String browserCodeName, String browserName, String brouserVersion,
			boolean cookiesEnabled, String browserLanguage, boolean browserOnline, String platform,
			String userAgentHeader) {
		this.ipUser = ipUser;
		this.browserCodeName = browserCodeName;
		this.browserName = browserName;
		this.brouserVersion = brouserVersion;
		this.cookiesEnabled = cookiesEnabled;
		this.browserLanguage = browserLanguage;
		this.browserOnline = browserOnline;
		this.platform = platform;
		this.userAgentHeader = userAgentHeader;
	}

	public String getIpUser() {
		return ipUser;
	}

	public void setIpUser(String ipUser) {
		this.ipUser = ipUser;
	}

	public String getBrowserCodeName() {
		return browserCodeName;
	}

	public void setBrowserCodeName(String browserCodeName) {
		this.browserCodeName = browserCodeName;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getBrouserVersion() {
		return brouserVersion;
	}

	public void setBrouserVersion(String brouserVersion) {
		this.brouserVersion = brouserVersion;
	}

	public boolean isCookiesEnabled() {
		return cookiesEnabled;
	}

	public void setCookiesEnabled(boolean cookiesEnabled) {
		this.cookiesEnabled = cookiesEnabled;
	}

	public String getBrowserLanguage() {
		return browserLanguage;
	}

	public void setBrowserLanguage(String browserLanguage) {
		this.browserLanguage = browserLanguage;
	}

	public boolean isBrowserOnline() {
		return browserOnline;
	}

	public void setBrowserOnline(boolean browserOnline) {
		this.browserOnline = browserOnline;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getUserAgentHeader() {
		return userAgentHeader;
	}

	public void setUserAgentHeader(String userAgentHeader) {
		this.userAgentHeader = userAgentHeader;
	}
	
	

}

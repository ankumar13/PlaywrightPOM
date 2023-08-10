package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

	private Page page;
	
	private String emailId = ".login-form >form > [name='email']";
	private String password = ".login-form >form > [name='password']";
	private String loginBtn = "//button[text()='Login']";
	private String logoutLink = "//a[text()=' Logout']";
	
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public String getLoginPageTitle() {
		return page.title();
	}
	
	public boolean doLogin(String appUserName, String appPassword) {
		System.out.println("App Credentials: "+appUserName+" : "+appPassword);
		page.fill(emailId, appUserName);
		page.fill(password, appPassword);
		page.click(loginBtn);
		
		if(page.isVisible(logoutLink)) {
			System.out.println("Logged In Successfully !");
			return true;
		}
		return false;
	}
		
}

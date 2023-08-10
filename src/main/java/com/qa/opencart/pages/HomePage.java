package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class HomePage {

	Page page;
	
	private String loginSignupBtn = "//a[text()=' Signup / Login']";
	private String productLink = "//a[text()=' Products']";
	private String addProduct1 = "(//p[text()='Blue Top']/following-sibling::a)[1]";
	private String addProduct2 = "(//p[text()='Men Tshirt']/following-sibling::a)[1]";
	private String continueShoppingBtn = "//button[text()='Continue Shopping']";
	private String cartBtn = "//a[text()=' Cart']";
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	public String getHomePageTitle() {
		String title =  page.title();
		System.out.println("The Title of HomePage is : "+title);
		return title;
	}
	
	public String getHomePageURL(){
		String url =  page.url();
		System.out.println("The URL of HomePage is : "+url);
		return url;
	}
	
	public LoginPage clickOnLoginLink(){
		page.click(loginSignupBtn);
		return new LoginPage(page);
	}
	
    public String navigateToProductsPage(){
    	page.click(productLink);
    	String prodPageTitle = page.title();
    	return prodPageTitle;
    }
    
    public void addProductsToCart() {
    	page.click(addProduct1);
    	page.click(continueShoppingBtn);
    	page.click(addProduct2);
    	page.click(continueShoppingBtn);
    }
    
    public String goToCart() {
    	page.click(cartBtn);
    	String cartPageTitle = page.title();
    	return cartPageTitle;
    	
    }
	
	
}

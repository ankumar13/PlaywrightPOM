package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)	
	public void homePageTitleTest() {
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, AppConstants.HOME_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void homePageUrlTest() {
		String actualURL = homePage.getHomePageURL();
		Assert.assertEquals(actualURL, prop.getProperty("url"));
	}
	
	@Test(priority=3)
	public void goToProductsPageTest() {
		String prodPageHeading = homePage.navigateToProductsPage();
		System.out.println("Product Page Heading: " + prodPageHeading);
			
	}
	
	@Test(priority=4)
	public void addProductsToCartTest() {
		homePage.addProductsToCart();
	}
	
	@Test(priority=5)
	public void cartPageTitleTest() {
		String actualTitle = homePage.goToCart();
		Assert.assertEquals(actualTitle, AppConstants.CART_PAGE_TITLE);
	}
	
		
}

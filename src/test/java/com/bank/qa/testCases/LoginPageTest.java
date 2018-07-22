package com.bank.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	public LoginPageTest() {
	
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		intialization();
		
		loginPage = new LoginPage();
		
		//homePage = new HomePage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		
		String title = loginPage.validateLoginPageTitle();

		System.out.println("Title of the Page is:"+title);
		
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@Test(priority=2)
	public void logoTest() {
		
		boolean flag = loginPage.validateLogo();
		
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		
		homePage = loginPage.login(prop.getProperty("userid"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}

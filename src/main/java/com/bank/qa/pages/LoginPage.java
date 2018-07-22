package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class LoginPage extends TestBase{

	// Page Factory OR Object Repository:
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='reset']")
	WebElement reset;
	
	@FindBy(xpath="//a[text()='here']")
	WebElement signUp;
	
	@FindBy(xpath="//img[@src='/logo.png']")
	WebElement guru99Logo;
	
	// Initializing the Page Objects:
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	// Actions:
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		
		return guru99Logo.isDisplayed();
	}
	
	public HomePage login(String uname, String pswd) {
		
		username.sendKeys(uname);
		password.sendKeys(pswd);
		login.click();
		
		return new HomePage();
	}
	
}

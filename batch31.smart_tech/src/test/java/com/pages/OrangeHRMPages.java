package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPages {
	
	public OrangeHRMPages (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using = "//*[@name='username']")
	private static WebElement username; 
	
	//@FindBy (xpath = "//*[@name='username']")
	//WebElement username;
	
	@FindBy (how = How.XPATH, using = "//*[@name='password']")
	private static WebElement password;
	
	//@FindBy (xpath = "//*[@name='password']")
	//WebElement password;
	
	@FindBy (how = How.XPATH, using = "//*[@type='submit']")
	private static WebElement login; 
	
	//@FindBy (xpath = "//*[@type='submit']")
	//WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

//	public static void setUsername (WebElement username) {
//		OrangeHRMPages.username = username;
//	}
//	
//	public static void setPassword (WebElement password) {
//		OrangeHRMPages.password = password; 
//	}
//	
//	public static void setLogin(WebElement login) {
//		OrangeHRMPages.login = login;
//	}
}

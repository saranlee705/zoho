package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class singletondesignpattern {
	public WebDriver driver;
	public singletondesignpattern(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage getLoginPage() {
		LoginPage lp= new LoginPage(driver);
		return lp;
		
	}}
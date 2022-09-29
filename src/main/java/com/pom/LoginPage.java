package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//WebElement email = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
	//WebElement mail = driver.findElement(By.id("emailfield"));
	//WebElement pass = driver.findElement(By.xpath("//input[@class='form-input sgnpaswrd']"));
	//WebElement click = driver.findElement(By.xpath("//span[@id='signup-termservice']"));
    //WebElement click1 = driver.findElement(By.xpath("(//input[@class='signupbtn'][1])"));
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Sign Up Now']")
	private WebElement email;
	
	@FindBy(id ="emailfield")
	private WebElement mail;
	
	@FindBy(xpath ="//input[@class='form-input sgnpaswrd']")
	private WebElement pass;
	
	@FindBy(xpath="//span[@id='signup-termservice']")
	private WebElement click;
	
	@FindBy(xpath = "(//input[@class='signupbtn'][1])")
	private WebElement click1;
	
	public LoginPage (WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getemail() {
		return email;
	}
	
	public WebElement getmail() {
		return mail;
	}
	
	public WebElement getpass() {
	return pass;	
	}
	
	public WebElement getclick() {
		return click;
	}
	
	public WebElement getclick1() {
		return click1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

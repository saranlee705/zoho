package com.stepdefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.runner.Runner;
import com.zoho.zoho.Xlsxreader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination extends BaseClass {

	public static WebDriver driver = Runner.driver;

	@Given("user open the browser url")
	public void user_open_the_browser_url() {
		launchUrl("https://www.zoho.com/login.html");

	}

	@Given("user fill the email id")
	public void user_fill_the_email_id() throws Exception {
		WebElement email = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
		email.click();

		WebElement mail = driver.findElement(By.id("emailfield"));
		userInput(mail, "asdbsjbvj@gmail.com");

	}

	@When("user fill the password")
	public void user_fill_the_password() throws Exception {
		WebElement pass = driver.findElement(By.xpath("//input[@class='form-input sgnpaswrd']"));
		userInput(pass, "1234567890");
		Thread.sleep(3000);
	}

	@When("user click the checkbox")
	public void user_click_the_checkbox() {
		WebElement click = driver.findElement(By.xpath("//span[@id='signup-termservice']"));
		clickOnElement(click);
	}

	@Then("click the login button")
	public void click_the_login_button() {
		WebElement click1 = driver.findElement(By.xpath("(//input[@class='signupbtn'][1])"));
		clickOnElement(click1);

	}
}

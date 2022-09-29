package com.zoho.zoho;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\WELCOME\\eclipse-workspace\\aa\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
		email.click();
		
		WebElement mail = driver.findElement(By.id("emailfield"));
		String value = Xlsxreader.particularData("zoho", 0, 0);
		mail.sendKeys(value);
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='form-input sgnpaswrd']"));
		String value1= Xlsxreader.particularData("zoho", 0, 1);
		pass.sendKeys(value1);
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//span[@id='signup-termservice']"));
        click.click();
        
        WebElement click1 = driver.findElement(By.xpath("(//input[@class='signupbtn'][1])"));
	    click1.click();
	
	
	}
	

}




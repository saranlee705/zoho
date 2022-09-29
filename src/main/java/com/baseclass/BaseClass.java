package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver=null;
	public static void userInput(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void printText(WebElement element) {
		String text=element.getText();
		System.out.println(text);
	}
	
	public static void isEnabled(WebElement element) {
		boolean check = element.isEnabled();
		System.out.println(check);
	}
	public static void clear(WebElement element) {
		element.clear();
		};
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public static WebDriver browserLaunch(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\WELCOME\\eclipse-workspace\\aa\\driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
		 driver= new EdgeDriver();
			 
		}
		else if (browser.equalsIgnoreCase("gecko")) {
		 driver= new FirefoxDriver();
			
		}
		else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
	
		return driver;
	
	}
	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public static void printTitle() {
	String title=driver.getTitle();
	System.out.println(title);
	}
	public static void printUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void NavigateTo(String navigate,String url) {
		
			driver.navigate().to(url);
}
	public static void NavigateBFR(String Navigate) {

	
		 if (Navigate.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}
		else if (Navigate.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
			
		}
	else if (Navigate.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
	}}
	
	public static void alert(String alertt,String value) {
		Alert a= driver.switchTo().alert();

		if (alertt.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (alertt.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
		else if (alertt.equalsIgnoreCase("sendkeys")) {			
			a.sendKeys(value);
			
		}
		else if (alertt.equalsIgnoreCase("Gettext")) {
			String t = a.getText();
			System.out.println(t);
		}
	}
	public static void selectDropDown(WebElement element, String options,String value) {
		Select s= new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (options.equalsIgnoreCase("text")) {
			int n = Integer.parseInt(value);
			s.selectByIndex(n);
		}
	else {
		System.out.println("Invalid select");
	}
		
	}
	public static void actions(String options, WebElement element) {
		Actions a= new Actions(driver);
		if (options.equalsIgnoreCase("move to element")) {
			a.moveToElement(element).build().perform();
		}
		else if (options.equalsIgnoreCase("rightclick")) {
			a.contextClick();
			
		}
		else if(options.equalsIgnoreCase("double click")) {
			a.doubleClick();
		}
		
		
	}
	public static void robot(String options) throws AWTException {
		Robot r= new Robot();
		if (options.equalsIgnoreCase("page up")) {
			r.keyPress(KeyEvent.VK_PAGE_UP);
			r.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		else if (options.equalsIgnoreCase("page down")) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		else if (options.contentEquals("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}
	public static void screenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File  destination= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Facebook\\screensot\\shot1.png");
		FileUtils.copyFile(source, destination);
	}
	
	
	public static void javaScriptExecutor(WebElement element,String options,String x, String y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		if (options.equalsIgnoreCase("scroll")) {
			js.executeScript("window.scrollBy(x, y);");
			
		}
		else if (options.equalsIgnoreCase("click")) {
			js.executeScript("window.scrollBy(x, y);");
			js.executeScript("arguments[0].click();" ,element);

		}
	}
	}

	
	

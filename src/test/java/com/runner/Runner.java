package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\WELCOME\\eclipse-workspace\\zoho\\src\\test\\java\\com\\feature\\zoho.feature", glue = "com.srepdefination", plugin = {
		"pretty", "html:Report/HtmlReport1.html", "junit:Report/XmlReport1.xml","json:Report/JsonReport1.json" }, monochrome = true)
public class Runner extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
	browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		close();

	}

}

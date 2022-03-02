package com.testrunner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import com.maven.adactin.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature",
glue="com.adactin.stepdefinition",
//monochrome=true,
//dryRun=false,
//strict=false )
tags= ("@smokeTest"),
plugin = {"html:Report/Html_Report",
		"pretty",
		"json:Reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
})


public class Testrunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	private void setup() {
		
//		driver=Base_Class.browserLaunch("chrome");
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse\\SeleniumTesting\\Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}

	
	@AfterClass
	private void teardown() {

		driver.close();
		
	}
	
}

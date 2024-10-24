package com.inetbanking.testccases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr589214";
	public String password="geqedys";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

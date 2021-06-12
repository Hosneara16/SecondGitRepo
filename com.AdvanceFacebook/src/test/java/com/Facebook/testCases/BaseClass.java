package com.Facebook.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public String appURL = "https://www.facebook.com/";
	public String fname = "Sara";
	public String lastname = "Tara";
	public String mobnumber = "3477013941";
	public String newpassword = "11#Sara";
	public String month = "Aug";
	public String day = "26";
	public String year = "1965";
	public String gender = "1";
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Empty browser opened");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
		//System.out.println("Browser closed succesfully");
	}
	
	
	

}

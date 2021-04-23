package com.amazon.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_facebook {
	
	WebDriver driver;
	
@BeforeTest
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}

@Test
public void idTest() {
	
	driver.findElement(By.id("pass")).sendKeys("Mili");
	//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
}

@Test
public void nameTest() {
	driver.findElement(By.name("email")).sendKeys("ffff");
	
}
//@Test
public void classTest() {
	driver.findElement(By.tagName("submit")).click();
}

@Test
public void signinlinktextTest() {   
	 driver.findElement(By.linkText("Forgot Password?")).click();
	
}

@AfterTest
public void teardown() {
	driver.quit();
}

	
	
	}

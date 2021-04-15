package com.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondGitClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.target.com/");
//		driver.findElement(By.id("search")).sendKeys("Cloths");
//		driver.findElement(By.xpath("//*[@id=\"headerMain\"]/div[1]/form/button[2]")).click();
		driver.get("https://www.target.com/");
		driver.getTitle();
		System.out.println("Title");
		driver.findElement(By.id("search")).sendKeys("Toys");
		

	}

}

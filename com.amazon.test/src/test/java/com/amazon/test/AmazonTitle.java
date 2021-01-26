package com.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
//		String title = driver.getTitle();
//		System.out.println(title);
		//System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("We are in correct page");
		}
		else {
			System.out.println("Wrong application");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		//driver.quit();
		
	}

}

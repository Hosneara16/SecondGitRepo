package com.Menards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoMenards {
	
	WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/bafka/eclipse-workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.menards.com/main/home.html");
		
	}
	public void search() {
		driver.findElement(By.name("search")).sendKeys("Toys");
		driver.findElement(By.xpath("/html/body/div[4]/header/div[2]/div/nav/div/form/div[5]/div[1]/a")).click();
	}

	public static void main(String[] args) {
		
		LogintoMenards obj = new LogintoMenards();
		obj.openBrowser();
		obj.search();

	}

}

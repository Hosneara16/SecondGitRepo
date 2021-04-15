package com.getTitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();// driver exe 
		  
		  WebDriver driver = new ChromeDriver(); // browser
		  //this is how we open an application
		 driver.get("https://www.amazon.com/");
		 String atitle= driver.getTitle();
		 System.out.println(atitle);
		 String curl = driver.getCurrentUrl();
		 System.out.println(curl);
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
		 driver.findElement(By.id("searchDropdownBox")).click();
		  
		//driver.get("https://www.amazon.com/");
		 // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 
		 // String amazonTitle=driver.getTitle();
		  
		  //String is a data type
		  // amazonTitle is the variable name
		  // = is an operator
		  // driver.getTitle();is a selenium WebDriver interface method. also variable value.
		 
		// System.out.println("this is amazon title: "+amazonTitle);
		  // we are printing the title.
		  
		 String amazonURL=driver.getCurrentUrl();
		 // System.out.println("this amazon URL"+amazonURL);

	
	
	}

}

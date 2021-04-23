import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Regularxpath {

	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void signin() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mmmm");
		//driver.findElement(By.xpath("//input[@id='email'] | //input[@name='mail']")).sendKeys("MMMM");
		driver.findElement(By.xpath("//input[@id='email'] | //input[@name='mail']")).clear();
		driver.findElement(By.xpath("//input[@id='mail'or @name='email']")).sendKeys("RRR");
	}
	
	//@Test
	public void signinAndTest() {
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
	}
	
	@Test
	public void signinStartswithTest() {   //tag[starts-with(text(),'all the text or partial text')]
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_d')]")).click();
	}
	
	@Test
	public void signincontainsTest() {   //tag[contains(text(),'all the text or partial text')]
		driver.findElement(By.xpath("//button[contains(@id,'0_d_Fx')]")).click();
	}
	
	@Test
	public void signintextTest() {   
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
	}
	
	@Test
	public void signinfollowingTest() {   //Generally used for webtable
		driver.findElement(By.xpath("//*[@id='pageFooterChildren']//li[1]/a[1]")).click();
	}
	
	
	
		
		
	

}

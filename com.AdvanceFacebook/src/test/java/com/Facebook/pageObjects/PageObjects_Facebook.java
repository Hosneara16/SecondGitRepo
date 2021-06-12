package com.Facebook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjects_Facebook {
	
	WebDriver ldriver;

	public PageObjects_Facebook(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[starts-with(@id,'u_0_2')]")
	@CacheLookup
	WebElement clickNewAccount;
	
	public void clickCreateNewAccount() {
		clickNewAccount.click();
	}
	
	@FindBy(name="firstname")
	WebElement txtFName;
	
	public void setFName(String fname) {
		txtFName.sendKeys(fname);
		
	}
	
	@FindBy(name="lastname")
	WebElement txtLName;
	
	public void setLName(String lastname) {
		txtLName.sendKeys(lastname);
	}
	
	@FindBy(name="reg_email__")
	WebElement txtMobNumber;
	
	public void setMobNumber(String mobnumber) {
		txtMobNumber.sendKeys(mobnumber);
	}
	
	@FindBy(name="reg_passwd__")
	WebElement txtNewPassword;
	
	public void setNewPassword(String newpassword) {
		txtNewPassword.sendKeys(newpassword);
	}
	
	@FindBy(how = How.ID, using = "month")
	WebElement ddownMonth;
	
	public void selectMonth(String month) {
		Select sel = new Select(ddownMonth);
		sel.selectByVisibleText(month);
	}
	
	@FindBy(how = How.ID, using = "day")
	WebElement ddownDay;
	
	public void selectday(String day) {
		Select sel = new Select(ddownDay);
		sel.selectByVisibleText(day);
		
	}
	
	@FindBy(id = "year")
	WebElement ddownYear;
	
	public void selectYear(String year) {
		Select sel = new Select(ddownYear);
		sel.selectByVisibleText(year);
	}
	
	@FindBy(how = How.NAME, using = "sex")
	WebElement clickGender;
	
	public void clickonGender(String gender) {
		clickGender.click();
		
	}
	
	@FindBy(xpath = "//*[@name='websubmit']")
	WebElement clickSignup;
	
	public void clickOnSignUp() {
		clickSignup.click();
	}
	

}

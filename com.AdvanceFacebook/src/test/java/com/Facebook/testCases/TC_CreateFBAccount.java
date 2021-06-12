package com.Facebook.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Facebook.pageObjects.PageObjects_Facebook;

public class TC_CreateFBAccount extends BaseClass {
	
	@Test
	public void createAccountTest() {
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		PageObjects_Facebook pobj = new PageObjects_Facebook(driver);
		pobj.clickCreateNewAccount();
		pobj.setFName(fname);
		pobj.setLName(lastname);
		pobj.setMobNumber(mobnumber);
		pobj.setNewPassword(newpassword);
		pobj.selectMonth(month);
		pobj.selectday(day);
		pobj.selectYear(year);
		pobj.clickonGender(gender);
		pobj.clickOnSignUp();
		
		String currentURL=driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().contains(currentURL)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

}


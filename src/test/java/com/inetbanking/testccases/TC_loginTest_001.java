package com.inetbanking.testccases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbankingv1.pageobjects.LoginPage;

public class TC_loginTest_001 extends BaseClass 
	{
		@Test
		public void loginTest()
		{
			driver.get(baseURL);
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassowrd(password);
			
			lp.clicksubmit();
			
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertTrue(false);
			
			}
	}

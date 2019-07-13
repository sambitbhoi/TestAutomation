package com.finance.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.finance.Pages.HomePage;
import com.finance.Pages.LoginPage;
import com.finance.TestBase.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	//Test cases should be Independent
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		 loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homepage = homePage.verifyHomePagetitle();
		Assert.assertEquals(homepage, "CRMPRO","HomePage Title is not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		Assert.assertTrue(homePage.verifyUserName());
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

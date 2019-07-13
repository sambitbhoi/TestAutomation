package com.finance.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.finance.Pages.HomePage;
import com.finance.Pages.LoginPage;
import com.finance.TestBase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() 
	{
		super();
	}
	static ExtentTest test;
	
	static ExtentReports report;

	
	
	
	
	@BeforeClass
	public void setUp() 
	{
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");

		test = report.startTest("Automation Extent");
		test = report.startTest("TC01");
		initialization();
		 loginPage = new LoginPage();
		 test.log(LogStatus.PASS, "Login To URL");
	}
	
	@Test(priority = 1)
	public void validateLogo()
	{
		boolean flag = loginPage.valiadeCRMlogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
	}
	
	

}

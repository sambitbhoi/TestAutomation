package com.finance.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finance.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//input[contains(@type,'submit')]")
	WebElement btnLogin;
	
	@FindBy(xpath ="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean valiadeCRMlogo(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd)
	{
		userName.sendKeys(un);
		password.sendKeys(pwd);
		btnLogin.click();
		
		return new HomePage();
	}

}

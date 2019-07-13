package com.finance.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finance.TestBase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'naveen k')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOncontactsLink()
	{
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOndealsLink()
	{
		dealslink.click();
		return new DealsPage();
	}
	
	public TaskPage clickOntaskLink()
	{
		tasksLink.click();
		return new TaskPage();
	}
	
	
	
	

}

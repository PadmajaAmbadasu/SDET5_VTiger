package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTigerr.genericLib.WebDriverUtils;

public class HomePage {
	WebDriver driver;
	
	//Rule1:class name should be pagename
	
	//Rule2: Locate all elements by using @findBy,@findBys, @findAll 
	@FindBy (xpath="//a[text()='Organizations']")
	private WebElement organizationbtn;
	
	@FindBy (xpath="//a[text()='Contacts']")
	private WebElement contactsctn;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutimg;
	
	@FindBy (xpath="//a[text()='Sign Out']")
	private WebElement signoutbtn;
	
	
	//Rule3: Use Constructor for initialising the webelements
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Rule4:Provide getters for accessing the webelements

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOrganizationbtn() {
		return organizationbtn;
	}


	public WebElement getContactsctn() {
		return contactsctn;
	}


	public WebElement getLogoutimg() {
		return logoutimg;
	}


	public WebElement getSingnoutbtn() {
		return signoutbtn;
	}
	
	//Rule5:Create a Business Library is required for respective action done on the samepage
	public void logoutfromApp() 
	{
		WebDriverUtils driverUtils = new WebDriverUtils(driver);
		driverUtils.movetoElement(logoutimg);
		driverUtils.movetoElement(signoutbtn);
		signoutbtn.click();
	}
}

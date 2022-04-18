package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTigerr.genericLib.PropFile_Util;

public class LoginPage //Rule1:class name should be pagename
{
	WebDriver driver;
	//Rule2: Locate all elements by using @findBy,@findBys, @findAll 
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton ;
	
	//Rule3: Use Constructor for initialising the webelements
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Rule4:Provide getters for accessing the webelements
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//Rule5:Create a Business Library is required for respective action done on the samepage
	public void logintoApp() throws Throwable 
	{
	PropFile_Util file_Util= new PropFile_Util();		
	getUsername().sendKeys(file_Util.readdatafrompropfile("username"));
	getPassword().sendKeys(file_Util.readdatafrompropfile("password"));
	getLoginbutton().click();
}
}
package com.objectRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCntInfo {
	
	
	WebDriver driver;
	
	@FindBy(name="lastname")
	private WebElement lastnametxt;
	
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement plusbtn;
	
	public  CreateCntInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}

	public WebElement getCreatecontactsimg() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

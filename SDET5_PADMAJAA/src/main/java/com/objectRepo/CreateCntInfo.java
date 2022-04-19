package com.objectRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCntInfo {
	
	
	WebDriver driver;
	@FindBy(name="salutationtype")
	private WebElement ContSelByValDD;
	
	@FindBy(name="firstname")
	private WebElement contactFirstNmTxtb;
	
	@FindBy(name="lastname")
	private WebElement contactLoststNmTxtb;
	
	@FindBy(css="img[title='Select']")
	private WebElement selectOrgNmInCnts;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	public  CreateCntInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContSelByValDD() {
		return ContSelByValDD;
	}

	public WebElement getContactFirstNmTxtb() {
		return contactFirstNmTxtb;
	}

	public WebElement getContactLoststNmTxtb() {
		return contactLoststNmTxtb;
	}

	public WebElement getSelectOrgNmInCnts() {
		return selectOrgNmInCnts;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

		
}

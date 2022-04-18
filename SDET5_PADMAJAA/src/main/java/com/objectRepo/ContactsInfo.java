package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTigerr.genericLib.WebDriverUtils;

public class ContactsInfo {
	WebDriver driver;
	//Rule2: Locate all elements by using @findBy,@findBys, @findAll 
		@FindBy (xpath="//img[@alt='Create Contact...']")
		private WebElement createCntbtn;
		
		@FindBy (xpath="//input[@class='txtBox']")
		private WebElement searchctntxt;
		
		@FindBy (xpath="//input[@class='crmbutton small create']")
		private WebElement searchbtn ;
		
		@FindBy(id="bas_searchfield")
		private WebElement searchforcontactDD;
		
		@FindBy(name="search_text")
		private WebElement searchcontacttxtfld;

		
		//Rule3: Use Constructor for initialising the webelements
		public ContactsInfo(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		//Rule4:Provide getters for accessing the webelements

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getCreateCntbtn() {
			return createCntbtn;
		}

		public WebElement getSearchctntxt() {
			return searchctntxt;
		}

		public WebElement getSearchbtn() {
			return searchbtn;
		}
		
		public WebElement getSearchforcontactDD() {
			return searchforcontactDD;
		}
		public WebElement getSearchcontacttxtfld() {
			return searchcontacttxtfld;
		}
		
		public void checkcontactcreated(String contactname,String text) 
		{
			getSearchcontacttxtfld().sendKeys(contactname);
			WebDriverUtils driverUtils = new  WebDriverUtils(driver);
			driverUtils.selectbyvisibleText(text, getSearchforcontactDD());
			getSearchforcontactDD().click();
		}

		

	}
		
		




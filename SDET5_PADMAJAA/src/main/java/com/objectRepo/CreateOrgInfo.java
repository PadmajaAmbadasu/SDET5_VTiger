package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTigerr.genericLib.WebDriverUtils;

public class CreateOrgInfo {

	WebDriver driver;
	//Rule2: Locate all elements by using @findBy,@findBys, @findAll 
	
	public CreateOrgInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnametxtbox;

	@FindBy(name="industry")
	private WebElement industrydd;

	@FindBy(name="accounttype")
	private WebElement typedd;

	@FindBy(name="rating")
	private WebElement ratingdd;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveorgbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgnametxtbox() {
		return orgnametxtbox;
	}

	public WebElement getIndustrydd() {
		return industrydd;
	}

	public WebElement getTypedd() {
		return typedd;
	}

	public WebElement getRatingdd() {
		return ratingdd;
	}
	@FindBy(id="bas_searchfield")
	private WebElement OrgvalDD;
	
	@FindBy (xpath="//input[@name='search_text']")
	private WebElement searchorgTest;
	
	public WebElement getSearchorgTest() {
		return searchorgTest;
	}

		public WebElement getOrgvalDD() {
		return OrgvalDD;
	}

	public void setOrgvalDD(WebElement orgvalDD) {
		OrgvalDD = orgvalDD;
	}

	public WebElement getorgnametxtbox() {
		return orgnametxtbox;
	}

	public WebElement getIndustry() {
		return industrydd;
	}

	public WebElement getType() {
		return typedd;
	}

	public WebElement getRating() {
		return ratingdd;
	}

	public WebElement getSaveorgbtn() {
		return saveorgbtn;
	}
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phonenotxtbox;


	public WebElement getPhonenotxtbox() {
		return phonenotxtbox;
}
	public void OrgDropDown(String orgname,String Value) {
		
		WebDriverUtils driverUtils=new WebDriverUtils(driver);
		driverUtils.selectValuefromDD(OrgvalDD, "value");
	}
}
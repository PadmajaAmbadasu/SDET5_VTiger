package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTigerr.genericLib.WebDriverUtils;

public class OrganizationInfo {  //Rule1:class name should be pagename

 WebDriver driver;
 
	//Rule2: Locate all elements by using @findBy,@findBys, @findAll 
	@FindBy (xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgbtn;
	
	@FindBy (name="search_text")
	private WebElement searchtxt;
	
	@FindBy (id="bas_searchfield")
	private WebElement orgNotxt;
	
	@FindBy (xpath="//input[@value=' Search Now ']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//table[@class=\"lvt small\"]//tr[3]//input[@name=\"selected_id\" and @type=\"checkbox\"]")
	private WebElement firstcheckbox;
	
	public WebElement getOrgSelByValDD() {
		return OrgSelByValDD;
	}

	public void setOrgSelByValDD(WebElement orgSelByValDD) {
		OrgSelByValDD = orgSelByValDD;
	}
	@FindBy(xpath="//input[@class=\"crmbutton small delete\"]")
	private WebElement deletebtn;
	
	@FindBy(xpath="//span[normalize-space()='No Organization Found !']")
	private WebElement noOrgfound;
	@FindBy(id="bas_searchfield")
	private WebElement OrgSelByValDD;
	
	//Rule3: Use Constructor for initialising the webelements
	public OrganizationInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Rule4:Provide getters for accessing the webelements

	public WebElement getCreateOrgbtn() {
		return createOrgbtn;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getOrgNotxt() {
		return orgNotxt;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public WebElement getFirstcheckbox() {
		return firstcheckbox;
	}
	
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	public WebElement getnoOrgfound() 
	{
		return noOrgfound;
	}
	public void searchForOrganisation(String orgname,String value)
	{
		getSearchtxt().sendKeys(orgname);
		WebDriverUtils driverUtils = new WebDriverUtils(driver);
		driverUtils.selectValuefromDD( getOrgSelByValDD(), value);
		getSearchbtn().click();

	
}

}	

package com.crm.TC;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTigerr.genericLib.WebDriverUtils;
import com.VTigerr.genericLib.fake_Data;
import com.objectRepo.BaseClass;
import com.objectRepo.CreateOrgInfo;
import com.objectRepo.HomePage;
import com.objectRepo.OrganizationInfo;

@Listeners(com.VTigerr.genericLib.MyListeners.class)
public class TC001  extends BaseClass
{

	@Test(groups = "smoke")
	public void testcase() throws Throwable 
	{
		HomePage home=new HomePage(driver);
		home.getOrganizationbtn().click();
		//Create Organization

		OrganizationInfo orginfoPage = new  OrganizationInfo (driver);
		orginfoPage.getCreateOrgbtn().click();
		
		CreateOrgInfo newOrgPage = new CreateOrgInfo (driver);
		String orgname=data.orgName();
		newOrgPage.getorgnametxtbox().sendKeys(orgname);
		
        WebDriverUtils driverUtils=new WebDriverUtils(driver);
		driverUtils.selectValuefromDD(newOrgPage.getIndustry(),"Chemicals");
		driverUtils.selectValuefromDD(newOrgPage.getRating(),"Active");
		driverUtils.selectValuefromDD(newOrgPage.getType(),"Customer");

		newOrgPage.getSaveorgbtn().click();
		Thread.sleep(3000);

		home.getOrganizationbtn().click();
		orginfoPage.getSearchtxt().sendKeys(orgname);
		
		newOrgPage.getOrgvalDD();

		Thread.sleep(3000);

		String actual_orgname=driver.findElement(By.xpath("//a[@title='Organizations']")).getText();

		Assert.assertEquals(actual_orgname, orgname);
		
	}
	@Test(groups = "integration")
	public void deleteOrgTest() throws Throwable {
		fake_Data data = new fake_Data();

		HomePage home= new HomePage(driver);
		home.getOrganizationbtn().click();
		//Create New Organisation
		OrganizationInfo orgInfo = new  OrganizationInfo(driver);
		orgInfo.getCreateOrgbtn().click();

		CreateOrgInfo newOrgPage = new CreateOrgInfo(driver);
		String orgname=data.orgName();
		newOrgPage.getorgnametxtbox().sendKeys(orgname);
		newOrgPage.getSaveorgbtn().click();
		Thread.sleep(3000);

		home.getOrganizationbtn().click();
		orgInfo.getSearchbtn();

		//orgInfo.getSearchbtn(orgname, "accountname");
		Thread.sleep(3000);
		
		orgInfo.getFirstcheckbox().click();
		orgInfo.getDeletebtn().click();
		
		WebDriverUtils driverUtils=new WebDriverUtils(driver);
		driverUtils.acceptAlert();
		//Thread.sleep(3000);
		driverUtils.waitforelement(orgInfo.getnoOrgfound());
		newOrgPage.getOrgvalDD();
		String msg= orgInfo.getSearchtxt().getText();
	
        Assert.assertEquals(msg, "No Organization Found!");
       

	
		

	}}
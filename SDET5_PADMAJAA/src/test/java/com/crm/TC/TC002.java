package com.crm.TC;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.objectRepo.BaseClass;
import com.objectRepo.CreateOrgInfo;
import com.objectRepo.HomePage;
import com.objectRepo.OrganizationInfo;

@Listeners(com.VTigerr.genericLib.MyListeners.class)
public class TC002 extends BaseClass {
	
	@Test(groups = "smoke")
	public void createOrg() throws Throwable {
		
		HomePage home=new HomePage(driver);
		home.getOrganizationbtn().click();
		//Create new orgnization
		
		OrganizationInfo orgInfo=new OrganizationInfo(driver);
		orgInfo.getCreateOrgbtn().click();
		
		CreateOrgInfo newOrgPage = new CreateOrgInfo (driver);
		String orgname=data.orgName();
		newOrgPage.getorgnametxtbox().sendKeys(orgname);

		newOrgPage.getSaveorgbtn().click();
		Thread.sleep(3000);
		
		home.getOrganizationbtn().click();
		orgInfo.getOrgNotxt();
		
		String actual_orgname=driver.findElement(By.xpath("//a[@title='Organizations']")).getText();

		Assert.assertEquals(actual_orgname, orgname);
	}
	@Test(groups = "integration", enabled=false)
	public void createorgwithmobilenoTest() throws InterruptedException, IOException 
	{
		
		HomePage home= new HomePage(driver);
		home.getOrganizationbtn().click();
		//Create New Organisation
		OrganizationInfo orgInfo = new  OrganizationInfo (driver);
		orgInfo.getCreateOrgbtn().click();

		CreateOrgInfo newOrgPage = new CreateOrgInfo (driver);
		String orgname=data.orgName();
		newOrgPage.getorgnametxtbox().sendKeys(orgname);

		newOrgPage.getorgnametxtbox().sendKeys(data.phoneNumber());

		newOrgPage.getSaveorgbtn().click();
		Thread.sleep(3000);

		home.getOrganizationbtn().click();
		//orgInfo.getSearchtxt(orgname, "accountname");

		String actual_orgname=	driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		
		Assert.assertEquals(actual_orgname, orgname);
		driverUtils.closeBrowser();
	}
	
}
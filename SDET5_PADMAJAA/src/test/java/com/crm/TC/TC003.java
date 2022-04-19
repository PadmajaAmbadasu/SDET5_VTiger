package com.crm.TC;
	
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTigerr.genericLib.WebDriverUtils;
import com.VTigerr.genericLib.fake_Data;
import com.objectRepo.BaseClass;
import com.objectRepo.ContactsInfo;
import com.objectRepo.CreateCntInfo;
import com.objectRepo.HomePage;
import com.objectRepo.SearchOrgPopup;

public class TC003 extends BaseClass{

	@Test (groups = "integration")
	public void createcontactwithorg() throws Throwable 
	{
		HomePage home=new HomePage(driver);
		home.getContactsbtn().click();

		//Testcase3

		ContactsInfo contactPage = new ContactsInfo(driver);
		contactPage.getCreateCntbtn().click();

		fake_Data fake_Data = new fake_Data();
		String contactname=fake_Data.lastName();
		contactPage.getSearchctntxt().sendKeys(contactname);

		contactPage.getSearchcontacttxtfld().click();
		// window switching
        WebDriverUtils driverUtil= new WebDriverUtils(driver);
		driverUtil.switchTowindow("Accounts");
		SearchOrgPopup org_popup = new SearchOrgPopup();
		org_popup.searchandSelectforOrg("TYSS");


		driverUtil.switchTowindow("Contact");

		contactPage.getSearchbtn().click();

		Thread.sleep(3000);
		home.getContactsbtn().click();

		//validation
		contactPage.checkcontactcreated(contactname, "Last Name");

		Thread.sleep(3000);

		String fname=driver.findElement(By.xpath("//span[@vtfieldname='lastname']/..")).getText();

		Assert.assertEquals(fname, contactname);

	}
	@Test(groups="smoke")
	public void createcontact() throws InterruptedException, IOException
	{
		HomePage homePage = new HomePage(driver);
		homePage.getContactsbtn().click();

		CreateCntInfo  contactPage = new CreateCntInfo(driver);
		contactPage.getSelectOrgNmInCnts().click();

		CreateCntInfo  contactPage1 = new CreateCntInfo(driver);

		fake_Data fake_Data = new fake_Data();
		String contactname=fake_Data.firstName();
		contactPage1.getContactLoststNmTxtb().sendKeys(contactname);
		
		contactPage1.getSavebtn().click();

		Thread.sleep(3000);
		homePage.getContactsbtn().click();

	//	contactsInfo.checkcontactcreated(contactname, "Last Name");

		Thread.sleep(3000);

		String fname=driver.findElement(By.xpath("//span[@vtfieldname='lastname']/..")).getText();

		Assert.assertEquals(fname, contactname);

	}
}

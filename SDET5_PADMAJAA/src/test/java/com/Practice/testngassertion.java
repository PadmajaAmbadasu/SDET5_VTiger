package com.Practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngassertion {

	
	@Test
	
	public void assertion() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize()	;
		String title=driver.getTitle();
		//hard Assertion
	//	Assert.assertEquals(title, "Vtiger");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(title, "Vtiger");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		softAssert.assertAll();
		
	}

}
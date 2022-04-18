package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class handlingStaleElementexp {
	
		WebDriver driver= new ChromeDriver();
		@FindBy(name="user_name")
		WebElement username;
		
		public handlingStaleElementexp() 
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindAll(value = { @FindBy(name="user_password"),@FindBy(xpath="//input[@type='password']")})
		WebElement password;
	
		@FindBys(value = { @FindBy (xpath="//input[@value='Login']"),@FindBy(id="submitButton")})
		WebElement loginbtn;

		@Test
		public void handlingstale()
		{
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		username.sendKeys("admin");
	    driver.navigate().refresh();
	    password.sendKeys("admin");
	    loginbtn.click();
		}
		
		}



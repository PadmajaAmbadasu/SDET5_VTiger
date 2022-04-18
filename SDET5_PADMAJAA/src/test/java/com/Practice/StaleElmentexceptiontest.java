package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElmentexceptiontest {
	@Test
	public void staleelement() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8888");
	driver.manage().window().maximize();
	WebElement un=driver.findElement(By.name("user_name"));
	WebElement pwd= driver.findElement(By.name("user_password"));
    WebElement submitbtn=driver.findElement(By.cssSelector("[id='submitButton']"));
    un.sendKeys("admin");
    driver.navigate().refresh();
    pwd.sendKeys("admin");
    submitbtn.click();
	}	
	
	}



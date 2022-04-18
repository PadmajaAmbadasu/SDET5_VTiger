package com.Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contextclicktest {
	
	@Test
	
	public void contextclick() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.cssSelector("[id='submitButton']")).click();

        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//a[text()='Organizations']"));
        actions.contextClick(elementLocator).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}

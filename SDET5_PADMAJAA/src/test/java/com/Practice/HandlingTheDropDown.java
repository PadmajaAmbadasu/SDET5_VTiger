package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTheDropDown {
	
	@Test
	public void handlingthedropdown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("id=\"searchDropdownBox")).click();
		List<WebElement> options = driver.findElements(By.xpath("//select/option"));
		
		for(int i=1;i<=options.size();i++)
		{
			String option = options.get(i).getText();
			char ch=option.charAt(option.length()-1);
			if(ch=='e')
			{
				System.out.println(option);
				options.get(i).click();
				break;
			}
			
		}
	}
	}



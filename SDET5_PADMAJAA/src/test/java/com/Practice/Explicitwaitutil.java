package com.Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitutil {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://localhost8888");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement un= driver.findElement(By.name("user_name"));
//	WebElement pwd=driver.findElement(By.name("user_password"));
//	WebElement click =driver.findElement(By.xpath("//input[@id='submitButton']"));
//	
//	WebDriverWait wait=new WebDriverWait(driver, 15) 
//			wait until(un, condition)


	}

}

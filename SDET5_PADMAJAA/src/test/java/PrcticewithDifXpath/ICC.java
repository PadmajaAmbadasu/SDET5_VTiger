package PrcticewithDifXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC {

	@Test
	public void iccxpath() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icc-cricket.com/");
		 
		driver.findElement(By.xpath("//div[normalize-space()='Live']")).click();
/*The normalize-space function in XPath ignores all redundant spaces in a target
		string HTML element and matches with a given value.*/ 	
		
		
	}
}

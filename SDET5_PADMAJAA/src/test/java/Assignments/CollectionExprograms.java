package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionExprograms {
	
	public static void main (String args[]) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("url"));
	List<WebElement> options = driver.findElements(By.xpath("//select[@title='Search in']//option"));
		
	List optionslist=new ArrayList(options);
			
	System.out.println(optionslist);
			
				
	
	
	
}
}

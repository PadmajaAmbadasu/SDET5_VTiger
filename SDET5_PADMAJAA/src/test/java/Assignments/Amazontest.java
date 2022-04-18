package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {
	@Test
	public void amazon() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("url"));
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
		
		List OriginalList=new ArrayList();
		for(WebElement ele:options) 
		{
		String OptionsList = ele.getText();
		OriginalList.add(OptionsList);
		}
		List tempList= new ArrayList(OriginalList);

		Collections.sort(OriginalList);
		if(tempList.equals(OriginalList))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(OriginalList);
		System.out.println(tempList);
}
}
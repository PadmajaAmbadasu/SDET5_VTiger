package PrcticewithDifXpath;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeMakeMyTrip {
	
	@Test(dataProvider="Values")
	public void practicemakemytrip()
	{
		//to handle 
		Date date= new Date();
		String s1 = date.toString();
		System.out.println(s1);
		//Tue Apr 05 13:29:29 IST 2022
		//0    1   2    3      4    5
		String[] str = s1.split(" ");
		String date1 =str[2];
		String month=str[1];
		String year=str[5];
		String day=str[0];
		String currentdate=day+" "+month+" "+date1+"  "+year;
		System.out.println(currentdate);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		driver.findElement(By.id("fromCity")).sendKeys("src");
		driver.findElement(By.xpath("//div[@class='calc60']")).click();
		
		
		driver.findElement(By.id("toCity")).sendKeys("des");
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='stop']")).click();
		driver.findElement(By.xpath("//div[@aria-label='currentdate']")).click();
		 
		for(int i=0; i<11;i++) {	
			//problem statement will be stored in try block
		try 
		{
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 03 2022']")).click();
		break;
		}
		catch(Exception e)
		{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 }
		}
	}
	@DataProvider
	public Object[][] values()
	{	
	Object obj[][]=new Object[3][3];
			obj[0][0]="Hyd";
	        obj[0][1]="Ban";
	        obj[0][2]="Ban";
	        
	        obj[0][0]="Hyd";
	        obj[0][1]="CCU";
	        obj[0][2]="CCU";
			return obj;
		
	}

}

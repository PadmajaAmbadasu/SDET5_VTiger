package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	@Test
	public void Flipkart() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[text()='✕']")).click();
WebElement wb = driver.findElement(By.name("q"));
wb.sendKeys("mobiles under 20000");
Thread.sleep(3000);
wb.submit();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,100)");

driver.findElement(By.xpath("(//div[@class='_3879cV'])[5]")).click();
 //checking the page opened is mi mobiles 
String actual = driver.findElement(By.xpath("//div[text()='Redmi Note 11 (Starburst White, 64 GB)']")).getText();
Thread.sleep(3000);
if(actual.contains("Redmi"))
{
System.out.println("true");
}
else {
	System.out.println("fail");
}
	}

}

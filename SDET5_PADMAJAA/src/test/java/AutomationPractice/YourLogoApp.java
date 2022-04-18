package AutomationPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YourLogoApp {
	
	@Test
	public void yourlogoapp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padmajaambadasu@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("navabharath");
        driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
       driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("printed summer dresses");
       driver.findElement(By.xpath("//button[@name='submit_search']")).click();
       
       JavascriptExecutor js=(JavascriptExecutor)driver;
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,500)");
       Thread.sleep(5000);
       WebElement wle= driver.findElement(By.cssSelector("img[alt='Printed Summer Dress']"));
       Actions action= new Actions(driver);
       action.moveToElement(wle).perform();
      
      driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
       driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
       }
	

}

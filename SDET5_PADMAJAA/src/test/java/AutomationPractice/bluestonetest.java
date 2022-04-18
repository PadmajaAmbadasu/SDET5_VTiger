package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bluestonetest {
	
	@Test
	public void bluestone() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Rings']")).click();
		
		WebElement wel=driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
		Actions action = new Actions(driver);
		action.moveToElement(wel).perform();
		
		Thread.sleep(3000);	
   WebElement wle=driver.findElement(By.xpath("//span[text()=' Popular ']"));
   Actions act=new Actions(driver);
   act.moveToElement(wle).perform();
    driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
    
	
	}
}

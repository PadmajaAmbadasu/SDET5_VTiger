package AutomationPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltiptest {
	@Test
	public void tooltip() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://localhost:8888");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.cssSelector("[id='submitButton']")).click();
        driver.findElement(By.xpath("//a[text()='Organizations']")).click();
        WebElement vtiger=driver.findElement(By.xpath("//img[@title='Create Organization...']"));
		String expectedTooltip="Create Organization";
        String actualTooltip = vtiger.getAttribute("title");	
        
        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip))
        {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();	
	}

}

package com.VTigerr.genericLib;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	WebDriver driver;
	public WebDriverUtils(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author Padmaja
	 * This method will wait unless and until webpage is loaded or not.
	 * if loaded in given time then control will go to next line 
	 * 
	 */
	public void pageloadtimeout() 
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	/**
	 * @author Padmaja
	 * This method will maximise the window
	 * 	 */

	public void maximisewindow() {
		driver.manage().window().maximize();
	}

	/**
	 * @author Padmaja
	 * This method slecting value from DD
	 * this method will ony work when tagname is select
	 * @param webElement
	 * @param value
	 */
	public void selectValuefromDD(WebElement webElement,String value) 
	{
		Select select = new Select(webElement);
		select.selectByValue(value);

	}
	/**
	 * @author Padmaja
	 * This method will select value from DD based on index Value
	 * @param element
	 * @param index
	 */


	public void selectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}
	/**
	 * this method is selecting text from DD based on Visible text
	 * @param text
	 * @param element
	 */
	public void selectbyvisibleText(String text,WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This methos is going to do mouse hover
	 * @param target
	 */
	public void movetoElement(WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();

	}
	/**
	 * @author 
	 * This method will close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
//	/**
//	 * This method is for explicit wait
//	 * @param element
//	 */
//		public void waitforelement(WebElement element)
//		{
//			WebDriverWait wait = new WebDriverWait(driver, 15,TimeUnit.SECONDS);
//			wait.until(ExpectedConditions.visibilityOf(element));
//		}

	/**
	 * 
	 * @param index
	 */

	public void switchtoframe(int index) {
		driver.switchTo().frame(index);
	}
	public void switchtoframe(String StringorId) {
		driver.switchTo().frame(StringorId);
	}
	public void switchtoframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void drangAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	public void switchTowindow(String title) {
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();

		while(iterator.hasNext()) 
		{
			String currentwindow=iterator.next();
			String currenttitle=driver.switchTo().window(currentwindow).getTitle();
			if(currenttitle.contains(title)) {
				break;
			}
		}

	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	public void waitandclick(WebElement element) {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(15));
	//	wait.until(ExpectedConditions.elementToBeClickable(element)).click();
}
}







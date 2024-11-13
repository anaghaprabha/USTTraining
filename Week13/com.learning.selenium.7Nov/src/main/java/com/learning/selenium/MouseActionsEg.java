package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.7Nov\\src\\main\\resources\\MouseActionsEg.html");

		Actions actions = new Actions(driver);

		WebElement clickBtn = driver.findElement(By.id("clickButton"));

		// Perform Click
		actions.click(clickBtn).perform();

		Thread.sleep(2000);

		// mouse over
		WebElement hoverDiv = driver.findElement(By.id("hoverDiv"));
		actions.moveToElement(hoverDiv).perform();
		Thread.sleep(3000);

		// double click
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickButton"));
		actions.doubleClick(doubleClickButton).perform();
		Thread.sleep(2000);

		// Right click
		actions.contextClick(clickBtn).perform();
		Thread.sleep(2000);
		
		WebElement dragDiv = driver.findElement(By.id("dragDiv"));		
		WebElement dropArea = driver.findElement(By.id("dropArea"));
		
		//drag and drop
		actions.clickAndHold(dragDiv).moveToElement(dropArea).release().perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}

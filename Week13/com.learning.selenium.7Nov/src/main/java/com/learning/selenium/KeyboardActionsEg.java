package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsEg {

	public static void main(String[] args) throws Exception {

		// chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// create instance of driver
		WebDriver driver = new ChromeDriver();

		// load webpage under test
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.6Nov\\src\\main\\resources\\KeyboardActions.html");
	
		WebElement inputField = driver.findElement(By.id("inputField"));
		
		inputField.sendKeys("some text here...!");
		System.out.println(inputField.getAttribute("value"));
		Thread.sleep(2000);
		
		//inputField.sendKeys(Keys.BACK_SPACE);
		inputField.sendKeys(Keys.BACK_SPACE+" "+Keys.BACK_SPACE);
		
		inputField.sendKeys(Keys.CONTROL+" "+"A");
		
		System.out.println(inputField.getAttribute("value"));
		
		inputField.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

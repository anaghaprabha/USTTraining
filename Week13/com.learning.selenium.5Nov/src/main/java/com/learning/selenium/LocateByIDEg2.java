package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIDEg2 {

	public static void main(String[] args) throws Exception {

		// chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// create instance of driver
		WebDriver driver = new ChromeDriver();

		// load webpage under test
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.30oct\\src\\main\\resources\\LocateByIDEg2.html");
	
		//locate the button
		WebElement testButton = driver.findElement(By.id("testButton"));
		Thread.sleep(2000);
        //click buttontest
		testButton.click();
		
		Thread.sleep(2000);
		//locate the message element
		WebElement messageText = driver.findElement(By.id("message"));
		String newMsg = messageText.getText();
		System.out.println("Message Text is :"+newMsg);
		Thread.sleep(1000);
		driver.quit();
		
	}

}

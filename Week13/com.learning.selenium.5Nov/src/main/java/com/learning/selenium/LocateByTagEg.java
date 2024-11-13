package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagEg {

	public static void main(String[] args) throws Exception {

		//Set Driver Path in System Property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		//Create WebDriver instance
		WebDriver driver = new ChromeDriver();

		//Get Web page path
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.4Nov\\src\\main\\resources\\LocateByNameEg.html");
	
		WebElement element = driver.findElement(By.tagName("input"));
		
		element.sendKeys("sometext");
		
		System.out.println(element.getAttribute("name"));
		
		Thread.sleep(8000);
	
		driver.quit();
		
	}

}

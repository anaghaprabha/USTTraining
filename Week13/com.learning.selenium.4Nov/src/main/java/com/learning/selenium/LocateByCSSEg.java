package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSEg {

	public static void main(String[] args) throws InterruptedException {

		//Set Driver Path in System Property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		//Create WebDriver instance
		WebDriver driver = new ChromeDriver();

		//Get Web page path
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.4Nov\\src\\main\\resources\\LocateByCSSEg.html");
	
		//CSS Selector by class
		//WebElement element = driver.findElement(By.cssSelector(".input-field"));
		//WebElement element = driver.findElement(By.cssSelector("input.some-id"));
		//CSS Selector by id
		//WebElement element = driver.findElement(By.cssSelector("#some-id"));
		//CSS Selector by id with input#
		//WebElement element = driver.findElement(By.cssSelector("input#some-id"));
		//CSS Selector with attribute "input[type='email']"
		//WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
		//CSS Selector using parent child elements
		WebElement element = driver.findElement(By.cssSelector("form input"));
		
		element.sendKeys("somepassword");
		Thread.sleep(6000);
		
		System.out.println(element.getAttribute("value"));
		
	
		driver.quit();
		
	}

}

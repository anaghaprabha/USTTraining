package com.learning.selenium;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByMultipleTagEg {

	public static void main(String[] args) throws Exception {

		// Set Driver Path in System Property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Create WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Get Web page path
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.4Nov\\src\\main\\resources\\LocateByNameEg.html");

		List<WebElement> elements = driver.findElements(By.tagName("input"));

		for (WebElement element : elements) {
			element.sendKeys("some text "+element.getAttribute("name"));
			System.out.println(element.getAttribute("name"));
		}

		Thread.sleep(8000);

		driver.quit();

	}

}

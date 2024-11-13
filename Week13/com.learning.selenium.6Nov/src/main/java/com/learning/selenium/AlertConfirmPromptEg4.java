package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmPromptEg4 {

	public static void main(String[] args) throws Exception {

		try {

			// chrome driver path
			System.setProperty("webdriver.chrome.driver",
					"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

			// create instance of driver
			WebDriver driver = new ChromeDriver();

			// load webpage under test
			driver.get(
					"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.5Nov\\src\\main\\resources\\AlertConfirmPromptEg.html");
			testAlert(driver);
			testConfirm(driver);
			testPrompt(driver);

			driver.quit();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void testAlert(WebDriver driver) throws Exception {

		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Show Alert']"));

		alertBtn.click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

	}
	
	private static void testConfirm(WebDriver driver) throws Exception {

		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Show Confirm']"));

		alertBtn.click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

	}
	
	private static void testPrompt(WebDriver driver) throws Exception {

		WebElement alertBtn = driver.findElement(By.id("prompt"));

		alertBtn.click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

	}

}

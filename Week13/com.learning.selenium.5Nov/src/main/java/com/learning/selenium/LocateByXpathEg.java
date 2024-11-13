package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpathEg {

	public static void main(String[] args) throws Exception {

		// chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// create instance of driver
		WebDriver driver = new ChromeDriver();

		// load webpage under test
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.5Nov\\src\\main\\resources\\LocateByIdEg.html");

		WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));

		usernameField.sendKeys("testingusername");

		System.out.println(usernameField.getAttribute("value"));

		Thread.sleep(2000);

		// xpath using exact text value
		// WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));

		// xpath using contains text value
		//WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(), 'in')]"));
		
		// invalid path
		try {
		WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(text(), 'XXLog')]"));
		}
		catch(Exception e) {
			System.out.println("Exception occurred "+e.getMessage());
		}
		
		// xpath using starts with text value
		WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(text(), 'Log')]"));

		System.out.println(loginBtn.getText());

		loginBtn.click();
		Thread.sleep(2000);
		driver.quit();

	}

}

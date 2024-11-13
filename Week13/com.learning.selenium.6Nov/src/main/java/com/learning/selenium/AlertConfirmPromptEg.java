package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmPromptEg {

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
	
		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Show Alert']"));
		
		alertBtn.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.quit();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

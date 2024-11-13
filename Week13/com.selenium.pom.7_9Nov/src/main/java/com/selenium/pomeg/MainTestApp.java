package com.selenium.pomeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTestApp {

	public static void main(String[] args) {
		
		// chrome driver path
				System.setProperty("webdriver.chrome.driver",
					"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

				// create instance of driver
				WebDriver driver = new ChromeDriver();
				
				HomePage homePage = new HomePage(driver);


	}

}

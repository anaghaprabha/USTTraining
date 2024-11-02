package com.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
public static void main(String[] args) throws Exception{
	//chrome driver path
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	//Create an instance of Chrome driver
	WebDriver driver = new ChromeDriver();
	
	//send get request for sample web page
	driver.get("http://www.example.com");
	
	//Retrieve Title of web page
	String title = driver.getTitle();
	
	System.out.println("Page Title is:"+title);
	
	Thread.sleep(3000);
	
	driver.quit();
}
}

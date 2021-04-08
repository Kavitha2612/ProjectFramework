package com.project.baseclass.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildClass extends BaseClass{

	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
	
	
		driver = BaseClass.browserLaunch("Chrome");
		
		Thread.sleep(3000);
		getUrl("https://www.facebook.com/");
		
		Thread.sleep(3000);
		emailID("Kavi");
		
		Thread.sleep(3000);
		getPSS("kavi85");
		
//		Thread.sleep(3000);
//		clickBtn();

		Thread.sleep(3000);
		screenShot();

		Thread.sleep(3000);
		
		getUrl("https://www.google.com/");
		Searcher("gmail");
		
		Thread.sleep(3000);
		//closeBrowser();
	}
}
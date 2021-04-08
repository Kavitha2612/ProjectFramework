package com.project.baseclass.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {

				String current = System.getProperty("user.dir");
		        System.out.println("Current working directory in Java : " + current);
		    
				System.setProperty("webdriver.chrome.driver", current + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			
			} else {
				System.out.println("Invalid Browsername");
			} 
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void emailID(String id)
	{
		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
		name.sendKeys(id);	
	}
	
	public static void getPSS(String id)
	{
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(id);	
	}
	
	public static void clickBtn()
	{

		WebElement create_btn = driver.findElement(By.xpath("//type[contains(@name,'login')]"));
		create_btn.click();
	}
	
	public static void Searcher(String s)
	{
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys(s);
	}
	
	public static void refresh() 
	{
		driver.navigate().refresh();	
	}
	
	public static void closeBrowser(){
		driver.quit();
	}

	public static void screenShot() throws IOException {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourceFile1 = ts1.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("C:\\Users\\Admin\\eclipse-workspace\\ProjectFramework\\Screenshot\\face1.png");
		FileUtils.copyFile(sourceFile1, destFile1);
	
	}
	
	
}
 
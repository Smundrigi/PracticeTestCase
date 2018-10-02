package com.test;

 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
 
public class Test1Test {
 
	public WebDriver driver;
@BeforeMethod	
	public void SetUpMethod()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\OneDrive\\Desktop\\MyProgramz\\MyDownloads\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.amazon.com");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

 @Test
 public void test_Login_Page()
 {
	 System.out.println("Write your Login page functionalities here");
 }
  
}
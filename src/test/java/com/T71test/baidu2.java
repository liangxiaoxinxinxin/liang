package com.T71test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class baidu2 {
	 WebDriver driver=null;	
		public static Object[][] primeNumbers(){
			return new Object[][] {{"新梦想软件测试","新梦想软件测试_百度搜索"},
				                    {"selenium","selenium_百度搜索"},
				                    {"12306","12306_百度搜索"}};	
			}
		
	  @BeforeMethod
	  @Parameters("url")
	  public  void setup(String urlString ){
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(urlString);  
	  }
	  
	  @Test(dataProvider = "test1")
	  public void test1(String kw,String expected) {
		  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
		  driver.findElement(By.cssSelector("#su")).click();
		  
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		  String title=driver.getTitle();
		  //断言
		  Assert.assertEquals(title, expected);
	  }
	  
	  @AfterMethod
	  public void end(){
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  driver.quit();	  
	  }
}

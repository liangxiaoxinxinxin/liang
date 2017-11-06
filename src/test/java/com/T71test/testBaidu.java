package com.T71test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testBaidu {
   WebDriver driver=null;	
  @BeforeMethod
   //@BeforeClass
  
  public  void setup(){
	 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.baidu.com");
  }
  @DataProvider(name = "test1")
  public static Object[][] primeNumbers(){
	  return new Object[][] {
		  {"新梦想软件测试","新梦想软件测试_百度搜索"},{"selenium","selenium_百度搜索"},{"12306","12306_百度搜索"}};
		  }
  @Test(dataProvider = "test1")
//  @Parameters("test1")
  public void f1(String kw,String kwtest) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
	  String title=driver.getTitle();
	
	  Assert.assertEquals(title, kwtest);
  }
  
//  @Test
//  @Parameters("test2")
//  public void f2(String kw) {
//	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
//	  driver.findElement(By.cssSelector("#su")).click();
//	  
//	  try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	  
//	  String title=driver.getTitle();
//	  Assert.assertEquals(title, kw+"_百度搜索");
//  }
//  
//  @Test
//  @Parameters("test3")
//  public void f3(String kw) {
//	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
//	  driver.findElement(By.cssSelector("#su")).click();
//	  
//	  try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	  
//	  String title=driver.getTitle();
//	
//	  Assert.assertEquals(title, kw+"_百度搜索");
//  }
   //@AfterClass
  @AfterMethod
  public void end(){
	  driver.quit();	  
  }
}

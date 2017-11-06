package com.T71test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baidu1 {
   WebDriver driver=null;	
	
  @BeforeMethod
  @Parameters("url")
  public  void setup(String urlString ){
	//  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(urlString);  
  }
  
  @Test
  @Parameters("test1")
  public void test1(String kw) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  
	  String title=driver.getTitle();
	  //断言
	  Assert.assertEquals(title, kw+"_百度搜索");
  }
  
  @Test
  @Parameters("test2")
  public void b(String kw) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  
	  String title=driver.getTitle();
	 
	  Assert.assertEquals(title, kw+"_百度搜索");
  }
  
  @Test
  @Parameters("test3")
  public void a(String kw) {
	  driver.findElement(By.cssSelector("#kw")).sendKeys(kw);
	  driver.findElement(By.cssSelector("#su")).click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  
	  String title=driver.getTitle();

	  Assert.assertEquals(title, kw+"_百度搜索");
  }
  
  
  @AfterMethod
  public void end(){
	  driver.quit();	  
  }
}

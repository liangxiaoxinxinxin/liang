package com.T71test;

import org.testng.annotations.Test;

import T71.baiduMainPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class baiduMainPageTest {
	  WebDriver driver=null;
  @BeforeMethod
  public void beforeMethod() {
	  driver=baiduMainPage.openBaidu(driver);
  }
  @Test
  public void f() {
	  driver=baiduMainPage.Serach(driver, "新梦想软件测试");
	
  }
  @Test
  public void f2() {
	  driver=baiduMainPage.Serach(driver, "12306");
	
  }
  @Test
  public void f3() {
	  driver=baiduMainPage.Serach(driver, "selenium");
	
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }
}

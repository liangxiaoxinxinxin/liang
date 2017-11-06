package com.T71test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import T71.browserutiles;
import junit.framework.Assert;

public class baiduTest {
	WebDriver driver;
  @Test
  public void f1(){
	  browserutiles.openurl(driver, "https://www.baidu.com");
	  browserutiles.wait(3);
	  browserutiles.search(driver, "hahaha");
	  browserutiles.wait(3);
	  String value=driver.getTitle();
	  Assert.assertEquals(value, "hahaha_百度搜索");
	  browserutiles.quit(driver);
	  
  }
  }

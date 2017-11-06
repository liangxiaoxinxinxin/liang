package T71;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class baiduMainPage {
	public  static WebDriver openBaidu(WebDriver driver){
//		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\chromedriver.exe");
//		  driver=new ChromeDriver();
		WebDriver driver1 =  new FirefoxDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver1.get("https://www.baidu.com");
		return driver1;
		
	}
	public static WebDriver Serach(WebDriver driver,String Serach){
		driver.findElement(By.cssSelector("#kw")).sendKeys(Serach);
	    driver.findElement(By.cssSelector("#su")).click();
	    try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		  String title=driver.getTitle();
		  Assert.assertEquals(title, Serach+"_百度搜索");
		return driver;	
	}
	
	 public void end(WebDriver driver){
		 try {
				Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		  driver.quit();	  
	  }
	}




package T71;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserutiles {

	public static void openurl(WebDriver driver,String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_121\\bin\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(url);
		  

	}
	public static void search(WebDriver driver,String search1){
		driver.findElement(By.cssSelector("input#kw")).sendKeys(search1);
		driver.findElement(By.cssSelector("input#su")).click();
	}
	public static void wait(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		}
	
	public static void quit(WebDriver driver){
		driver.close();	
	}}

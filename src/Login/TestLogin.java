package Login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLogin {
	
	
	 public static void main(String[] args) { 
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuri Liyanage\\Documents\\New folder\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://www.linkedin.com/login"); 
		  WebElement username=driver.findElement(By.id("username")); 
		  WebElement password=driver.findElement(By.id("password")); 
		  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
		  username.sendKeys("isu110996@gmail.com"); password.sendKeys("Isuri@1996"); 
		  login.click(); 
		  String actualUrl="https://www.linkedin.com/feed/"; 
		  String expectedUrl= driver.getCurrentUrl(); 
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
			  System.out.println("Test passed"); 
		 }else {
			  System.out.println("Test failed"); 
			  } 
		  }
	 
}

package selineum.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String args[]) {
	System.setProperty("Webdriver.chromedriver.driver","C:\\Users\\Isuri Liyanage\\Documents\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com/");
    driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("isu110996@gmail.com"); 
	driver.findElement(By.className("RveJvd snByac")).click();
	String at = driver.getTitle();
	String et = "gmail";
	driver.close();
                 if(at.equalsIgnoreCase(et)) {
		System.out.println("Test Successful");
                 }else {
                    System.out.println("Test Failure");
                        }
		}

}





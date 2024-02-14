package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https//:www.half.ebay.com");
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//Delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Absolute xpath : not recommended
		//
		//1.performance issue
		//2.not reliable
		//3.can be changed at any time in future
		
		driver.findElement(By.xpath("//input[contains(@class='actextbox')]"));
		
		//Dynamic id: input
		//id= test_123
		//By.id("test_123");
		
		//starts-with
		//id = test_789
		//id = test_373
		//id = test_123
		
		//ends-with
		//id - 24133_test_	
		//id - 787_test_t
		//id - 382_test_t
		driver.findElement(By.xpath("//input[starst-with(@id,'test_')]"));
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_')]"));
		
		driver.findElement(By.xpath("//input[starst-with(@id,'test_')]"));
 

	}
}

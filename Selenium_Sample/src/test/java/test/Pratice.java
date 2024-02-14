package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pratice {
	public static void main(String[] args) {
		airline();
	}
	@Test
	public static void airline() {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
//	driver.manage().timeouts().implicitlyWait();
	driver.get("https://www.spicejet.com/");
	
//	driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	
	
	
	driver.findElement(By.xpath("//div[contains(text(),'From')]")).sendKeys("blr");
	
//	driver.findElement(By.xpath("//input[@id='myfile']"))
	
	
	
	
//	driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
	
	driver.findElement(By.xpath("//div[(text()='To')]")).sendKeys("cok");
	
	driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("");

	
//	driver.findElement(By.xpath(""));
	}
}




























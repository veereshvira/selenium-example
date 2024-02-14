package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2FSign-up%2Fs%2F%3F_encoding%3DUTF8%26k%3DSign%2520up%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

//		Locators:-
//		1.xpath
//
//		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Travis");
//
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("travis@gmail.com");
//
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("travis@123");
//
//		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("travis@123");
//
//		driver.findElement(By.xpath("//span[@id='auth-continue']")).click();
//		
//		driver.close();

//		2.id

//		driver.findElement(By.id("ap_customer_name")).sendKeys("Travis");
//		
//		driver.findElement(By.id("ap_email")).sendKeys("travis@gmail.com");
//		
//		driver.findElement(By.id("ap_password")).sendKeys("travis@123");
//		
//		driver.findElement(By.id("ap_password_check")).sendKeys("travis@123");
//		
//		driver.findElement(By.id("continue")).click();
//		
//	
//		driver.close();

//		3.class
//
//		driver.findElement(By.name("customerName")).sendKeys("Travis");
//
//		driver.findElement(By.name("email")).sendKeys("travis@gmail.com");
//
//		driver.findElement(By.name("password")).sendKeys("travis@123");
//
//		driver.findElement(By.name("passwordCheck")).sendKeys("travis@123");
//
//		driver.close();

//		4.linkText

//		driver.findElement(By.linkText("Conditions of Use")).click();

//		driver.findElement(By.linkText("Sign in")).click();

//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());

//		5.partialLinkText: (means that we can only)--> Not Recommended 
		
//		driver.findElement(By.partialLinkText("Sign")).click();
//		driver.close();
		
//		6.CSSSelector
		
//		driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Travis");
		
//		7.ClassName
		
//		driver.findElement(By.className("a-link-emphasis")).click();
		
		
		
	}

}

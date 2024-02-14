package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenCart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.findElement(By.id("input-username")).sendKeys("Veeresh_vira");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Veeresh");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Vira");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("veeresh@gmail.com");
		
//		driver.findElement(By.id(null)).sendKeys(args);

		
//		Select the drop-down box for this Selecting the Drop-down!
		Select select = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		select.selectByVisibleText("Fiji");
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("veer09876");

//		driver.findElement(By.linkText("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")).click();
	}
	
}

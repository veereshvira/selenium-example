package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pratice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");

//		driver.get("https://www.opencart.com/index.php?route=account/register");
//		
//		driver.findElement(By.id("input-username")).sendKeys("veeresh_vere");
//		
//		driver.findElement(By.id("input-firstname")).sendKeys("Veeresh");
//		
//		driver.findElement(By.id("input-lastname")).sendKeys("vere");
//		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("veeresh@gmail.com");
//		
//		Select select = new Select(driver.findElement(By.id("input-country")));
//		select.selectByVisibleText("Fiji");
//		
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Veeresh");
//		
//		driver.findElement(By.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")).click();
//		
//		Thread.sleep(5000);

//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		driver.findElement(By.name("proceed")).click();

//		Alert alert = driver.switchTo().alert();
//		String alert1 = alert.getText();
//		System.out.println(alert1);
//		if (alert1.equals("Please enter a valid user name")) {
//		if (alert1.equals(alert.getText())) {
//			alert.accept();
//			System.out.println("Passed Successfully");
//		} else {
//		System.out.println("Failed to Automate");
//		}
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\User\\Desktop\\23-12-2022.txt");

		Thread.sleep(2000);
		driver.quit();

	}
}

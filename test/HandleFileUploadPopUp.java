package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("D:\\veeresh\\notepad\\13-12-2022.txt");
		
//		("D:\\veeresh\\notepad\\13-12-2022.text");
		
		
	}
}

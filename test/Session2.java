package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.quit();
	}
}

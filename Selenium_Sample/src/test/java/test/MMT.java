package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {
	static WebDriver driver;

	public static WebDriver usingChrome() {
//		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumLibs\\\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}

// Test to select a desired date in the datepicker for departure

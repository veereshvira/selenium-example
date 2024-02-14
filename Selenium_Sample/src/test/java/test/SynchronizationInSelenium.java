package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {
	public static void sendkeys(WebDriver driver, WebElement element, Duration timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
//	public static void sendkeys(WebDriver driver, WebElement element, Duration timeout, String value) {
//		new WebDriverWait(driver, timeout).until(ExpectedConditions.)u
//	}

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.freecrm.com/");
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		Implicitly wait - is always applied globally -- is available for all the WebElements

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		email.sendKeys("Suchi");
		password.sendKeys("qwerty123");

		Thread.sleep(2000);
		driver.quit();
	}
}

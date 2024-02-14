package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pra {
	
	public static void test(WebDriver driver, WebElement element, Duration timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='myFile']"));
		
		upload.sendKeys("C:\\Users\\User\\Desktop\\Bs_o_21");

//		driver.findElement(By.xpath(""));
		
	}
}

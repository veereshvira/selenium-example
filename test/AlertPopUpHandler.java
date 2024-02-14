package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopUpHandler {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(4000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("The Alert Message is Correct");
		} else {
			System.out.println("The Alert Message is Not-Correct");
		}

		alert.accept();

		driver.quit();

//		alert.dismiss();

	}
}

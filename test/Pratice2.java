package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid username")) {
			System.out.println("The alert message is correct");
		} else {
			System.out.println("The alert message is wrong");
			System.out.println(alert.getText());
		}
		alert.accept();
	}
}

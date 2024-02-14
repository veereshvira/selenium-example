package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public static void sample() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://mvnrepository.com/");

		driver.findElement(By.xpath("//header/nav[1]/a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[contains(text(),'Testing Frameworks & Tools')]")).click();
//
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if (text.equals("")) {
//			System.out.println("The Password matches");
//			alert.accept();
//		} else
//			System.out.println("Error While Entering the Password");
		driver.quit();
	}

	public static void main(String[] args) {
		sample();
		
	}
}

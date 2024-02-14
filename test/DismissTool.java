package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DismissTool {
	@Test
	public static void testing() {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public static void main(String[] args) {
	
		testing();
		
//		System.out.println();
	}
}

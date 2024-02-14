package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class TestIT {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://172.16.1.68:82/login");
		
		driver.findElement(By.xpath("//body/app-root[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-login-container[1]/nb-card[1]/nb-card-footer[1]/div[1]/button[1]")).click();
		
//		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//nb-layout-header/nav[1]/div[3]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//nb-card-body/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("IPL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//nb-card-body/form[1]/div[1]/div[2]/div[1]/div[2]/nb-select[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("nb-option-0")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//textarea[@id='space']")).sendKeys("ALM Openserve");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		driver.quit();
//		
		
	}
}

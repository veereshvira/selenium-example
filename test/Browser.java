
package test;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		String originalwindow =driver.getWindowHandle();
		//driver.navigate().to("https://youtube.com");
		/*
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().window(originalwindow);
		*/
		driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
//		driver.switchTo().frame(0)
		
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(2000);
	
		driver.close();
		driver.quit();
	}
}













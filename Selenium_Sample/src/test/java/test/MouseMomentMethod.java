package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMomentMethod {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Actions actions = new Actions(driver);
	
		actions.moveToElement(driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"))).build().perform();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		driver.findElement(By.name(""));
		alert.accept();
		
		driver.findElement(By.linkText("Our Program")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}
}

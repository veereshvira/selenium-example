package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CustomizedXpath {
	@Test
	public static void test() {
		WebDriver driver = new ChromeDriver();

//		driver.get("https://in.tradingview.com/");

		driver.get("https://in.tradingview.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@class='searchBar-tKBJ0AoX js-header-search-button']")).click();


//		driver.findElement(By.xpath("//input[@inputmode='search']")).sendKeys("Indigo");

//		driver.findElement(By.xpath("//input[contains(@inputmode,'search')]")).sendKeys("Indigo");
		
//		dynamic-id input
//		id: test_231
//		by.id("test_892")
		driver.findElement(By.xpath("//input[starts-with(@id,'sear')]")).sendKeys("Indigo");
		
		driver.findElement(By.xpath("//input[ends-with(@id,'')]")).sendKeys("Indigo");

	}

	public static void main(String[] args) {
		test();

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://in.tradingview.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.cssSelector("body.search-page.index-page:nth-child(2) div.tv-main:nth-child(5) div.tv-content:nth-child(5) div.js-main-page-promo:nth-child(6) div.main-sEwgKzPQ.js-main-page-promo-container div.contentContainer-sEwgKzPQ div.content-sEwgKzPQ div.actions-sEwgKzPQ.translateDownOpacityDelay-sEwgKzPQ > button.searchBar-tKBJ0AoX.js-header-search-button")).sendKeys("indigo");
//		sendKeys(driver, Search, 10, "indigo");

	}

//	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
//		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
//		element.sendKeys(value);
//	}
}

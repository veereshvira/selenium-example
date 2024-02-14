package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pratice3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.findElement(By.id("body.post-template-default.single.single-post.postid-985.single-format-standard.wp-custom-logo.wp-embed-responsive.footer-on-bottom.animate-body-popup.link-style-standard.has-sidebar.has-sticky-sidebar-widget.content-title-style-normal.content-width-normal.content-style-unboxed.content-vertical-padding-hide.non-transparent-header.mobile-non-transparent-header.hide-focus-outline:nth-child(2) div.cb-box__wrapper-center_modal div.cb-box__wrapper-table div.cb-box__wrapper-row div.cb-box.cb-box__type-center_modal.cb-box__layout-single.cb-box__layout-center.cb-ready > div.cb-close")).click();
//		driver.findElement(By.id("")).sendKeys("");
//		driver.findElement(By.xpath("")).sendKeys("");
		
//		Select select = new Select(driver.findElement(By.id("")));
//		select.selectByVisibleText("Delhi");
//		
//		Alert alert = driver.switchTo().alert();
//		String text =alert.getText();
//		if(text.equals("Please is "))
//		alert.accept();
		
		
	}
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//		MMT page link
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAiA76-dBhByEiwAA0_s9buXGiGXP_e6s3fgmCpwCAJf9iY_SKPzQGwmioBmKgkpi4AJn9uxDxoCWAAQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_MMT_Exact|Responsive|544716039990&s_kwcid=AL!1631!3!544716039990!e!!g!!mmt&ef_id=CjwKCAiA76-dBhByEiwAA0_s9buXGiGXP_e6s3fgmCpwCAJf9iY_SKPzQGwmioBmKgkpi4AJn9uxDxoCWAAQAvD_BwE:G:s");
		
//		Due to Avoid Login or Sign-up Click (Left side link)
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]")).click();
		
//		Select fights
		driver.findElement(By.cssSelector("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.page-section.sticky-scroll.topSection.appendBottom40 div.landingContainer.eng div.headerOuter div.chHeaderWrapper.navOnly div.chHeaderContainer ul.makeFlex.font12 li.menu_Flights div:nth-child(1) a.active.makeFlex.hrtlCenter.column > span.chNavText.darkGreyText")).click();
		
//		Click on One-Way-> Check-Box
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
		
		
//		Select/Click->(Travelling) From 
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/p[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).sendKeys("Bengalru, Inida");
		driver.findElement(By.tagName("span")).click();
//		Select select1=new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))).selectByVisibleText("");

//		
//		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Bengaluru, India");
		
		
		
		
//		Select Drop-down
//		Select select = new Select(driver.findElement(By.xpath("//span[contains(text(),'From')]")));
//		select.selectByVisibleText("Bengaluru, India");
		
		
		
//		Select ->(Destination)To
//		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
//		Select select3 = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/span[1]")));
//		select3.selectByVisibleText("Goa, India");
//		
//		
//		Select select1 = new Select(driver.findElement(By.cssSelector("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.minContainer div.widgetSection.appendBottom40.primaryTraveler div.fsw div.fsw_inner.returnPersuasion:nth-child(1) div.fsw_inputBox.dates.inactiveWidget:nth-child(4) label:nth-child(1) > span.lbl_input.latoBold.appendBottom10")));
//		select1.selectByVisibleText("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.minContainer div.widgetSection.appendBottom40.primaryTraveler div.fsw.widgetOpen div.fsw_inner.returnPersuasion:nth-child(1) div.fsw_inputBox.dates.inactiveWidget:nth-child(4) div.datePickerContainer:nth-child(2) div.flightCalOverlay div.dayPickerFlightWrap div.RangeExample div.DayPicker.Selectable.Range div.DayPicker-wrapper div.DayPicker-Months div.DayPicker-Month:nth-child(1) div.DayPicker-Body div.DayPicker-Week:nth-child(2) div.DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected:nth-child(3) div.dateInnerCell > p:nth-child(1)");
//		
//		//10 jan
//		
//		
//		Select select2 = new Select(driver.findElement(By.cssSelector("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.minContainer div.widgetSection.appendBottom40.primaryTraveler div.fsw div.fsw_inner.returnPersuasion:nth-child(1) div.fsw_inputBox.dates.reDates.inactiveWidget.shiftModal:nth-child(5) label:nth-child(2) > span.lbl_input.latoBold.appendBottom10")));
//		select2.selectByVisibleText("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.minContainer div.widgetSection.appendBottom40.primaryTraveler div.fsw.widgetOpen div.fsw_inner.returnPersuasion:nth-child(1) div.fsw_inputBox.dates.inactiveWidget:nth-child(4) div.datePickerContainer:nth-child(2) div.flightCalOverlay div.dayPickerFlightWrap div.RangeExample div.DayPicker.Selectable.Range div.DayPicker-wrapper div.DayPicker-Months div.DayPicker-Month:nth-child(1) div.DayPicker-Body div.DayPicker-Week:nth-child(2) > div.DayPicker-Day.DayPicker-Day--end.DayPicker-Day--selected:nth-child(5)");
//		//10 jan
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();

	}
}

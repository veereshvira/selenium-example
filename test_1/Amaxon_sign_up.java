package test_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaxon_sign_up {
	

//	public static void sendkeys(WebDriver driver, WebElement element, Duration timeout, String value) {
//		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
//		element.sendKeys(value);
//	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

//		WebElement signup = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
//
//		WebElement createAccountSubmit = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
//
//		WebElement customer_name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
//
//		WebElement phone_number = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
//
//		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
//
//		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
//
//		WebElement continue_signup = driver.findElement(By.xpath("//input[@id='continue']"));
//
//		signup.click();
////		signup.click();
//		createAccountSubmit.click();
//		customer_name.sendKeys("Karthik");
//		phone_number.sendKeys("7290849494");
//		email.sendKeys("karthik@gmail.com");
//		password.sendKeys("karthik@123");
////		continue_signup.click();
//		Thread.sleep(2000);
//		driver.quit();
		
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();

		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Karthik");

		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7290849494");

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("karthik@gmail.com");;

		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("karthik@123");;

//		WebElement continue_signup = driver.findElement(By.xpath("//input[@id='continue']"));
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
//		File file2 = new File("C:\\Users\\User\\Pictures\\Screenshots");
//		FileUtils.copyFile(file, file2);
		

		Thread.sleep(2000);
		driver.quit();

	}
}

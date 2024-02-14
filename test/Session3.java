package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session3 {
	public static void main(String[] args) throws InterruptedException {
		
//		It's for google chrome the url may be differ to browser to browser
		
		System.getProperty("webdriver.chrome.driver", "D:\\veeresh\\Selenium\\SeleniumDemo\\drivers\\chromedriver.exe");

//		WebDriver is a interface which used for launching a driver
//		ChromeDriver is a class a for launching a driver and create a object for it
		WebDriver driver = new ChromeDriver();
		
//		get() is a method, we need to write a url inside the the get()
		driver.get("https://www.youtube.com");

//		getTitle() is used to get "Title of the website" - which return String and
//		storing it and printing it!
		String title = driver.getTitle();
		System.out.println(title);

//		(Or else) We write the getTitle() method inside the printing statement and
//		print it!
		System.out.println(driver.getTitle());

//		Validating the Title
		if (title.equals("Google")) {
			System.out.println("Title is Correct");
		} else {
			System.out.println("Title is Wrong");
		}
		
//		getCurrentUrl() is used to get the current Url 
		System.out.println(driver.getCurrentUrl());
		
//		getPageSource() is used to get the page source of the current page
//		System.out.println(driver.getPageSource());
		
		
//		close() is used to close open tab in the browser when we run the program,
//		but when we used this close() is task will be running the background, make
//		sure that when we use close()
//		So we need to use quit() to close the tab and background task also!
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}
}

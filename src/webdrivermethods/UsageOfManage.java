package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.get("https://www.google.com");
		Thread.sleep(8000);
		//Minimize the browser
		driver.manage().window().minimize();
		Thread.sleep(5000);
		//Fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}

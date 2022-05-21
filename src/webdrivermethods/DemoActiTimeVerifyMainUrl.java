package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiTimeVerifyMainUrl {

	public static void main(String[] args) throws InterruptedException {
		// set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		//instantiate the browser specific class
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		//pass the main url
		driver.get("https://www.actitime.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}

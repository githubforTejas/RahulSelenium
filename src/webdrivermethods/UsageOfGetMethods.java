package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {

	public static void main(String[] args) throws InterruptedException {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		//Instantiating the browser specific class
		ChromeDriver driver =new ChromeDriver();
		//to wait for few seconds
		Thread.sleep(1000);
		//pass the main url
		driver.get("https://www.naukri.com/");
		//to close the browser
		driver.quit();
	}
}

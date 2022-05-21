package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToUrlUrl {

	public static void main(String[] args) throws MalformedURLException, Exception {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		//Call the URL(String spec) constructor
		URL main = new URL("https://www.dassault-aviation.com/en/");
		URL defencePage = new URL(main, "defense");
		URL civilPage = new URL(main, "civil");
		URL spacePage = new URL(main, "space");
		Thread.sleep(2000);
		
		driver.navigate().to(defencePage);
		Thread.sleep(2000);
		driver.navigate().to(civilPage);
		Thread.sleep(2000);
		driver.navigate().to(spacePage);
		Thread.sleep(2000);
		
		driver.quit();
	}
}

package webdrivermethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
	public static void main(String[] args) throws Exception {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Page redirection to create a page
		Navigation nav = driver.navigate();
		nav.to("https://www.facebook.com/pages/create/?ref_type=registration_form");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		driver.quit();
	}


}

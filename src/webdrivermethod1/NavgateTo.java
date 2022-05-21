package webdrivermethod1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavgateTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		Navigation nav = driver.navigate();
		nav.to("https://www.naukri.com/nlogin/login");
		Thread.sleep(4000);
		nav.back();
		Thread.sleep(4000);
		nav.forward();
		Thread.sleep(4000);
		nav.refresh();
		driver.quit();
	}
}

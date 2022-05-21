package webdrivermethod1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToURLUrl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/Products/");
		Thread.sleep(3000);
		URL main = new URL("https://licindia.in/Products/");
		driver.navigate().to(new URL(main, "Insurance-Plan"));
		Thread.sleep(2000);
		driver.navigate().to(new URL(main, "Pension-Plans"));
		Thread.sleep(2000);
		driver.navigate().to(new URL(main, "Micro-Insurance-Plans"));
		Thread.sleep(2000);
		driver.navigate().to(new URL(main, "Health-Plans"));
		Thread.sleep(2000);
		driver.quit();
	}
}

package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Dimension targetSize = new Dimension(20, 20);
		driver.manage().window().setSize(new Dimension(200, 200));
		Thread.sleep(5000);
		driver.quit();
	}
}

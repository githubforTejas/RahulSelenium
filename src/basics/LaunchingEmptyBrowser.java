package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyBrowser {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://mail.google.com/");
		 driver.quit();
	}
	
}

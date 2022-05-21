package webdrivermethods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser{

	public static void main(String[] args) throws InterruptedException {
		// set the driver executable path
		System.setProperty("webdriver.gecko.driver", "./drivers./geckodriver.exe");
		//instantiate the browser specific class
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		//pass the main url
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}

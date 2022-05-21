package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {

	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//Instantiate the browser specific class
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.get("https://www.google.com");
				//Get the size of the browser
				Dimension size = driver.manage().window().getSize();
				int height = size.getHeight();
				System.out.println("Height of the browser: "+height);
				int width = size.getWidth();
				System.out.println("Width of the browser: "+width);
				driver.quit();
	}
}

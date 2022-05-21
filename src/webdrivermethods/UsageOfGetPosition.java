package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); 
		Point position = driver.manage().window().getPosition();
		int startX = position.getX();
		System.out.println(startX);
		int startY = position.getY();
		System.out.println(startY);
		driver.quit();
	}
}

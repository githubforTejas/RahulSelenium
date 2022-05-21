package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(5000);
		
		//First click() will scrolls the webPage and then it will click the element
		driver.findElement(By.xpath("//label[text()='Male']/..//input[@type=\"radio\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

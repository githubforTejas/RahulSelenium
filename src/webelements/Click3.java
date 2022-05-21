package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Celebrating Ladi Kwali']")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}

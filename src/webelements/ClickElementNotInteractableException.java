package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElementNotInteractableException {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Categories']/..//input[@value=\"Tshirts\"]")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}

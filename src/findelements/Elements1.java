package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements1 {
//IF WE TRY TO SEARCH INVALID TAG THEN WE GET 0 ELEMENTS IT WILL NOT THROUGH EXCEPTION 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		List<WebElement> allElements = driver.findElements(By.tagName("rahul"));
		for (WebElement ele : allElements) {
			System.out.println(ele.getText());
		}
		System.out.println("Total elements count: " + allElements.size());
		System.out.println(allElements.isEmpty());
		System.out.println(allElements);
		driver.quit();
	}
}

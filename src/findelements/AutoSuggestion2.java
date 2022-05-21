package findelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {
//TO VERIFY WHEATHER THE ELEMENTS ARE IN PROPER ORDER OR NOT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		
		List<WebElement> menuList = driver.findElements(By.xpath("//div[@id='welcome-menu']//li/a"));
		List<String> actualOrder = new ArrayList<String>();
		for (WebElement ele : menuList) {
			actualOrder.add(ele.getText());
		}
		
		List<String> expectedOrder = Arrays.asList("About", "Support", "Logout");
		System.out.println("expectedOrder: " + expectedOrder);
		System.out.println("actualOrder: " + actualOrder);
		
		if (actualOrder.equals(expectedOrder)) {
			System.out.println("Pass::The elements are present in the order");
		}else {
			System.out.println("Fail::The elements are not present in the order");
		}
		driver.quit();
	}
}

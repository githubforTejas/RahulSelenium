package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion7 {
//TO CLICK ON THE PARTICULAR AUTO SUGGESTION
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
		List<WebElement> autoList = driver.findElements(By.xpath("//li[@class=\"sbct\" and not(@id=\"YMXe\")]"));
		System.out.println("Total AutoSuggestions= " + autoList.size());
		System.out.println(autoList);
		for (WebElement select : autoList) {
			if (select.getText().contains("webdriver")) {
				select.click();
				break;
			} 
		}
		driver.quit();
	}
}

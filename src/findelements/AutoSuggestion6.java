package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion6 {
//PROGRAM TO CLICK ON THE LAST AUTOSUGGESTION 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> defaultAutoSuggestionList = driver.findElements(By.xpath("//li[@class='sbct']"));
		for (WebElement ele : defaultAutoSuggestionList) {
			System.out.println(ele.getText());
		}
		defaultAutoSuggestionList.get(2).click();
		driver.quit();
	}
}

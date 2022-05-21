package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion5 {
//PROGRAM TO CLICK ON THE LAST AUTOSUGGESTION 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		List<WebElement> autoSuggestionList = driver.findElements(By.xpath("//li[@class='sbct']"));
		int lastSuggestion = autoSuggestionList.size()-1;
		autoSuggestionList.get(lastSuggestion).click();
		driver.quit();
	}
}

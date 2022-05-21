package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		List<WebElement> Suggestion = driver.findElements(By.xpath("//li[@class='sbct']"));
		for (WebElement ele : Suggestion) {
			System.out.println(ele.getText());
		}
		
		System.out.println("AutoSuggestions: " + Suggestion.size());
		Thread.sleep(5000);
		if (Suggestion.size()>=1 && Suggestion.size()<=10) {
			System.out.println("Pass::The AutoSuggestion Count Is Correct");
		}else {
			System.out.println("Fail::The AutoSuggestion Count Is Not Correct");
		}
		driver.quit();
	}
}

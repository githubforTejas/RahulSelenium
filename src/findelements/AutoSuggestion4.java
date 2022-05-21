 package findelements;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion4 {
//PROGRAM TO AUTOSUGGESTION TEXT IN ALPHABETICAL ORDER
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		List<WebElement> autoSuggestionList = driver.findElements(By.xpath("//li[@class='sbct']"));
		Set<String> actualOrder = new TreeSet<>(); 
		for (WebElement ele : autoSuggestionList) {
			System.out.println(ele.getText());
		}
		for (String s : actualOrder) {
			System.out.println(s);
		}
		driver.quit();
	}
}

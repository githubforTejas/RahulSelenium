package findelements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion3 {
//TO VERIFY AUTOSUGGESTIONS ARE IN ALPHABETICAL ORDER OR NOT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ibegin.tcs.com/iBegin/register");
		
		driver.findElement(By.cssSelector("input[placeholder='Enter your skills in order of expertise (Maximum 5)']")).sendKeys("Testing");
		List<WebElement> autoSuggestionsList = driver.findElements(By.cssSelector("li[data-ng-repeat='item in itemList']"));
		List<String> actualOrder = new ArrayList<String>();
		for (WebElement ele : autoSuggestionsList) {
			actualOrder.add(ele.getText());
		}
		
		List<String> expectedOrder = new ArrayList<>(actualOrder);
		Collections.sort(expectedOrder);
		System.out.println("expectedOrder: " + expectedOrder);
		System.out.println("actualOrder: " + actualOrder);
		
		if (actualOrder.equals(expectedOrder)) {
			System.out.println("Pass::The Elements Are Present In Alphabetical Order");
		}else {
			System.out.println("Pass::The Elements Are Not Present In Alphabetical Order");
		}
		driver.quit();
	}
}

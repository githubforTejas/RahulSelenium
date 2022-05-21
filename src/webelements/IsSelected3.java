package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected3 {
//Here isSelected() will misbehave because of using it in wrong place
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		if (driver.findElement(By.id("email")).isSelected()) {
			System.out.println("Pass::The Text Field is Selected");
		}else {
			System.out.println("Fail::The Text Field is not Selected");
		}
		driver.quit();
	}
}

package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {
//TO CHECK MALE RADIO BUTTON IS SELECTED OR NOT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type=\"radio\"]"));
		if (maleRadio.isSelected()) {
			System.out.println("Fail:: The Button is Selected");
		}else {
			System.out.println("Pass:: The Button is not Selected");
		}
		
		maleRadio.click();
		if (maleRadio.isSelected()) {
			System.out.println("Pass:: The Button is Selected");
		}else {
			System.out.println("Fail:: The Button is not Selected");
		}
		driver.quit();
	}
}

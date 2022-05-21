package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//STEP1
		driver.get("https://demo.actitime.com/login.do");
		
		//STEP2
		String expectedUrl = "https://demo.actitime.com/login.do";
		String actualUrl = driver.getCurrentUrl();
		String exceptedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		if ((actualUrl.equals(expectedUrl) && (actualTitle.equals(exceptedTitle)))) {
			System.out.println("Pass:: The URL & Title Is Correct");
		}else {
			System.out.println("Fail:: The URL & Title Is InCorrect");
		}
		
		//STEP3
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if (checkBox.isEnabled()) {
			System.out.println("Pass::The CheckBox Is Enabled");
		}else {
			System.out.println("Fail::The CheckBox Is Disabled");
		}
		
		//STEP4
		if (checkBox.isSelected()) {
			System.out.println("FAIL:: The CheckBox Is Selected");
		}else {
			System.out.println("Pass:: The CheckBox Is Not Slected");
		}
		
		checkBox.click();
		if (checkBox.isSelected()) {
			System.out.println("Pass:: The CheckBox Is Selected");
		}else {
			System.out.println("Fail:: The CheckBox Is Not Slected");
		}
		driver.quit();
	}
}

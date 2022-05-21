package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute1 {
//A PROGRAM TO VERIFY THE PLACEHOLDER TEXT OF USERNAME TEXTFIELD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expextedPlaceHolderText = "Username";
		String actualPlaceHolderText = driver.findElement(By.id("username")).getAttribute("placeholder");
		
		System.out.println("expextedPlaceHolderText: " + expextedPlaceHolderText);
		System.out.println("actualPlaceHolderText: " + actualPlaceHolderText);
		if (actualPlaceHolderText!=null) {
			if (actualPlaceHolderText.equals(expextedPlaceHolderText)) {
				System.out.println("PASS :: PLACEHOLDER TEXT IS CORRECT");
			}else {
				System.out.println("FAIL :: PLACEHOLDER TEXT IS INCORRECT");
			}
		}else {
			System.out.println("Fail:: Attribute is not present");
		}
		
		driver.quit();
	}
}

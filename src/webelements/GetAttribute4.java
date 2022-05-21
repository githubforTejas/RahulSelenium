package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute4 {
//A PROGRAM TO VERIFY THE PLACEHOLDER TEXT OF USERNAME TEXTFIELD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String expextedText = "Flipkart";
		String actualText = driver.findElement(By.className("_2xm1JU")).getAttribute("alt");
		
		System.out.println("expextedText: " + expextedText);
		System.out.println("actualText: " + actualText);
		
		if (actualText!=null) {
			if (actualText.equals(expextedText)) {
				System.out.println("PASS :: ALTERNATE NAME TEXT IS CORRECT");
			}else {
				System.out.println("FAIL :: ALTERNATE NAME TEXT IS INCORRECT");
			}
		}else {
			System.out.println("FAIL :: ALT ATTRIBUTE IS NOT PRESENT");
		}
	
		driver.quit();
	}
}

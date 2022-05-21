package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {
//A PROGRAM TO VERIFY THE PLACEHOLDER TEXT OF USERNAME TEXTFIELD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expextedToolTipText = "Do not select if this computer is shared";
		String actualToolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		System.out.println("expextedPlaceHolderText: " + expextedToolTipText);
		System.out.println("actualPlaceHolderText: " + actualToolTipText);
		
		if (actualToolTipText!=null) {
			if (actualToolTipText.equals(expextedToolTipText)) {
				System.out.println("PASS :: TOOLTIP TEXT IS CORRECT");
			}else {
				System.out.println("FAIL :: TOOLTIP TEXT IS INCORRECT");
			}
		}else {
			System.out.println("FAIL :: TITLE ATTRIBUTE IS NOT PRESENT");
		}
	
		driver.quit();
	}
}

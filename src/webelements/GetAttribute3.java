package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute3 {
//VERIFY THE USERNAME IS ENTERED CORRECTLY IN USERNAME TEXTFIELD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expectedEmail = "rahulwadi019@gmail.com";
		WebElement emailId = driver.findElement(By.id("email"));
		//TO VERIFY EMAILID TEXTFIELD IS EMPTY INITIALLY
		String actualEmailId = emailId.getAttribute("value");
		if (actualEmailId!=null) {
			if (actualEmailId.isEmpty()) {
				System.out.println("PASS :: THE EMAILID IS EMPTY");
			}else {
				System.out.println("FAIL :: THE EMAILID IS NOT EMPTY");
			}
		}else {
			System.out.println("FAIL :: THE value ATTRIBUTE NOT PRESENT");
		}
		emailId.sendKeys(expectedEmail);
		//TO VERIFY ENTERE TEXT IS PRESENT IN TEXTFIELD
		String actualEmailId1 = emailId.getAttribute("value");
		System.out.println("expectedEmail: " + expectedEmail);
		System.out.println("actualEmailId1: " + actualEmailId1);
		
		if (actualEmailId1!=null) {
			if (actualEmailId1.equals(expectedEmail)) {
				System.out.println("PASS :: THE EMAILID ENTERED PROPERLY");
			}else {
				System.out.println("FAIL :: THE EMAILID NOT ENTERED PROPERLY");
			}
		}else {
			System.out.println("FAIL :: THE value ATTRIBUTE NOT PRESENT");
		}
		driver.quit();
	}
}

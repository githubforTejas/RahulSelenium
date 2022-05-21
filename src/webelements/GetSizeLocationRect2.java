 package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationRect2 {
//TO CHECK THE LEFT & RIGHT ALIGNMENT 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//TO CHECK LEFT ALIGNMENT
		int usernameStartX = driver.findElement(By.id("username")).getLocation().getX();
		int pwdStartX = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println("usernameStartX: " + usernameStartX);
		System.out.println("pwdStartX: " + pwdStartX);
		if (usernameStartX==pwdStartX) {
			System.out.println("Pass:: The Username & Password Left Alignment Is Correct");
		}else {
			System.out.println("Fail:: The Username & Password Left Alignment Is not Correct");
		}
		//TO CHECK RIGHT ALIGNMENT
		Rectangle userNameRect = driver.findElement(By.id("username")).getRect();
		Rectangle pwdRect = driver.findElement(By.name("pwd")).getRect();
		int usernameEndX = userNameRect.getX() + userNameRect.getWidth();
		int pwdEndX = pwdRect.getX() + pwdRect.getWidth();
		System.out.println("usernameEndX: " + usernameEndX);
		System.out.println("pwdEndX: " + pwdEndX);
		if (usernameEndX==pwdEndX) {
  			System.out.println("Pass:: The Username & Password Right Alignment Is Correct");
		}else {
			System.out.println("Fail:: The Username & Password Right Alignment Is not Correct");
		}
 		driver.quit();
	}
}

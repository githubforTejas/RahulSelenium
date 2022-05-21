package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationRect5 {
//TO VERIFY EMAIL & PASSWORD TEXTFIELD ARE NOT OVERLAPPING
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signin/");
		Rectangle emailRect = driver.findElement(By.name("email")).getRect();
		int emailEndx = emailRect.getX() + emailRect.getWidth();
		int pwdRect = driver.findElement(By.name("pass")).getLocation().getX();
		
		System.out.println("emailEndx: " + emailEndx);
		System.out.println("pwdRect: " + pwdRect);
		
		if (pwdRect>emailEndx) {
			System.out.println("PASS::THE ELEMENTS ARE NOT OVERLAPPING");
		}else {
			System.out.println("FAIL::THE ELEMENTS ARE OVERLAPPING");
		}
		driver.quit();
	}
}

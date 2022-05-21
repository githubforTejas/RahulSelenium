package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationRect3 {
//TO CHECK THE LEFT & RIGHT ALIGNMENT 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension usernameSize = driver.findElement(By.id("username")).getSize();
		int usernameHeight = usernameSize.getHeight();
		int usernameWidth = usernameSize.getWidth();
		System.out.println("usernameHeight: " + usernameHeight);
		System.out.println("usernameWidth: " + usernameWidth);
		
		Dimension passwordSize = driver.findElement(By.name("pwd")).getSize();
		int pwdWidth = passwordSize.getWidth();
		int pwdHeight = passwordSize.getHeight();
		System.out.println("pwdHeight: " + pwdHeight);
		System.out.println("pwdWidth: " + pwdWidth);
		
		if ((usernameWidth==pwdWidth) && (usernameHeight==pwdHeight)) {
			System.out.println("Pass:: The Username & Password Height & Width IS Same");
		}else {
			System.out.println("Fail:: The Username & Password Height & Width IS Not Same");
		}
		driver.quit();
	}
}

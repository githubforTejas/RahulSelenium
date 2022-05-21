package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationRect4 {
//TO VERIFY EMAIL & PASSWORD TEXTFIELD TOP ALIGNMENT IS SAME
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signin/");
		Thread.sleep(5000);
		int emailStartY = driver.findElement(By.name("email")).getLocation().getY();
		System.out.println("emailStartY: " + emailStartY);
		int pwdStartY = driver.findElement(By.name("pass")).getLocation().getY();
		System.out.println("pwdStartY: " + pwdStartY);
		
		if (emailStartY==pwdStartY) {
			System.out.println("Pass::The UserName & Password TextField Top Alignment Is Correct");
		}else {
			System.out.println("Fail::The UserName & Password TextField Top Alignment Is Not Correct");
		}
		driver.quit();
	}
}

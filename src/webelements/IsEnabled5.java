package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled5 {
//HERE we are using //a but isEnabled will not work other than input & button tag 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		
		driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[text()=' ZIP']")).click();
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
		
		if (loginButton.isEnabled()) {
			System.out.println("Pass::The continue button is enabled");
		}else {
			System.out.println("Fail::The continue button is disabled");
		}
		driver.quit();
	}
}

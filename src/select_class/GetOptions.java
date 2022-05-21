 package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		//Identify the dropDown first
		WebElement monthDropDown = driver.findElement(By.id("month"));
		//Create an object for select class
		Select select = new Select(monthDropDown);
		
		List<WebElement> options = select.getOptions();
		System.out.println("Total Options Present are: " + options.size());
		for (WebElement opt : options) {
			System.out.println("Option= " + opt.getText());
		}
		driver.quit();
	}
}

package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_LastOption {

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
		//LAST OPTION SELECTING
		select.selectByIndex(select.getOptions().size()-1);
		driver.quit();
	}
}

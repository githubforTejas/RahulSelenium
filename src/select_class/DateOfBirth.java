package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		//Identify the dropDown first
		WebElement dayDropDown = driver.findElement(By.id("day"));
		//Create an object for select class
		Select select = new Select(dayDropDown);
		select.selectByVisibleText("19");
		if (select.getFirstSelectedOption().isSelected()) {
			System.out.println("19 is selected");
		} else {
			System.out.println("19 is not selected");
		}
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		//Create an object for select class
		Select select1 = new Select(monthDropDown);
		select1.selectByVisibleText("Apr");
		if (select1.getFirstSelectedOption().isSelected()) {
			System.out.println("April is selected");
		} else {
			System.out.println("April is not selected");
		}
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		//Create an object for select class
		Select select2 = new Select(yearDropDown);
		select2.selectByVisibleText("1998");
		if (select2.getFirstSelectedOption().isSelected()) {
			System.out.println("1998 is selected");
		} else {
			System.out.println("1998 is not selected");
		}
		driver.quit();
	}
}

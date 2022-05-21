package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationRect1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameTextField = driver.findElement(By.id("username"));
		
		Dimension dim = userNameTextField.getSize();
		System.out.println("Width= " + dim.getWidth());
		System.out.println("Height= " + dim.getHeight());
		
		Point loc = userNameTextField.getLocation();
		System.out.println("StartX= " + loc.getX());
		System.out.println("StartY= " + loc.getY());
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		Rectangle rect = userNameTextField.getRect();
		System.out.println("Width= " + rect.getWidth());
		System.out.println("Height= " + rect.getHeight());
		System.out.println("StartX= " + rect.getX());
		System.out.println("StartY= " + rect.getY());
		driver.quit();
	}
}

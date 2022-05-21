package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCss1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Get the element login and its coloring information
		String loginBackgroundColor = driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println("Login Button Background Color: " + loginBackgroundColor);
		//Convert the rgb into hexadecimal value
	    String hexacolor = Color.fromString(loginBackgroundColor).asHex();
		System.out.println("hexacolor: " + hexacolor);
		driver.quit();
	}
}

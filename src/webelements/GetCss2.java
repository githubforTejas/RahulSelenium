package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCss2 {
//TO COMPARE THE BACKGROUND COLOR OF BOOK NOW & FIND OUT MORE
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caferouge.com/");
		
		String bookNowColor = driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).getCssValue("background-color");
		System.out.println("bookNowColor: " + bookNowColor);
		String hexaColorBookNow = Color.fromString(bookNowColor).asHex();
		System.out.println("hexaColorBookNow: " + hexaColorBookNow);
		
		String findOutColor = driver.findElement(By.linkText("Find out more")).getCssValue("background-color");
		System.out.println("findOutColor: " + findOutColor);
		String hexaColorFindOutColor = Color.fromString(findOutColor).asHex();
		System.out.println("hexaColorFindOutColor: " + hexaColorFindOutColor);
		
		if (hexaColorBookNow.equals(hexaColorFindOutColor)) {
			System.out.println("Pass::The Color Is Same");
		}else {
			System.out.println("Fail:: The Color Is Not Same");
		}
		driver.quit();
	}
}

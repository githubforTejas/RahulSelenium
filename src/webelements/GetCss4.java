package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCss4 {
//TO CHECK THE COLOR & BOLDNESS OF TEXT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expectedBoldness = "400";
		WebElement text = driver.findElement(By.tagName("h2"));
		String actualBoldness = text.getCssValue("font-weight");
		System.out.println("expectedBoldness: " + expectedBoldness);
		System.out.println("actualBoldness: " + actualBoldness);
		if (actualBoldness.equals(expectedBoldness)) {
			System.out.println("Pass::The Text Is Bold");
		}else {
			System.out.println("Fail::The Text Is Not Bold");
		}
		
		String exceptedColor = "#1c1e21";
		String decicolor = text.getCssValue("color");
		String actualColor = Color.fromString(decicolor).asHex();
		System.out.println("exceptedColor: " + exceptedColor);
		System.out.println("actualColor: " + actualColor);
		if (actualColor.equals(exceptedColor)) {
			System.out.println("Pass::The Text Color Is Black");
		}else {
			System.out.println("Fail::The Text Color Is Not Black");
		}		
				
		driver.quit();
	}
}

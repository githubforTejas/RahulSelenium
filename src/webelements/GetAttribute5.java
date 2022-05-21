package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String exceptedToolTipText = "Flipkart";
		String actualToolTipText = driver.findElement(By.className("_2xm1JU")).getAttribute("title");
		
		System.out.println("exceptedToolTipText: " + exceptedToolTipText);
		System.out.println("actualToolTipText: " + actualToolTipText);
		
		if (actualToolTipText!=null) {
			if (actualToolTipText.equals(exceptedToolTipText)) {
				System.out.println("Pass::The ToolTIpText is Correct");
			}else {
				System.out.println("Fail::The ToolTIpText is InCorrect");
			}
		}else {
			System.out.println("Fail ::Title attribute is not present");
		}
		driver.quit();
	}
}

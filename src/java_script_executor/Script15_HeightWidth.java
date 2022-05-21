package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script15_HeightWidth {
//PROGRAM TO CALCULATE HEIGHT & WIDTH OF SCROLL BAR
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object webPageHeight = js.executeScript("return document.body.scrollHeight;");
		Object webPageWidth = js.executeScript("return document.body.scrollWidth;");
		System.out.println("webPageHeight: "+webPageHeight);
		System.out.println("webPageWidth: "+webPageWidth);
		driver.quit();
	}
}

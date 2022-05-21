package shadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("4.1.4 (April 27, 2022)")).click();
		Thread.sleep(1000);
		driver.get("chrome://downloads/");
		Thread.sleep(5000);
		
		WebElement shadowHost = driver.findElement(By.tagName("downloads-manager"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		WebElement childShadowHost = shadowRoot.findElement(By.cssSelector("downloads-item[id='frb0']"));
		SearchContext childShadowRoot = childShadowHost.getShadowRoot();
		
		childShadowRoot.findElement(By.cssSelector("a[id=\"file-link\"]")).click();
	}
}

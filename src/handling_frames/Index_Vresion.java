package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index_Vresion {
//PROGRAM TO CLICK ON AN ELEMENT WITHIN A FRAME USING INDEX VERSION
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("a[aria-label='Google apps']")).click();
		
		/*driver.findElement(By.linkText("YouTube")).click();
		 * HERE WE WILL GET NOSUCHELEMENTEXCEPTION BECAUSE THE ELEMENT IS PRESENT WITHIN THE FRAME
		 * SO FIRST WE NEED TO SHIFT TO THAT PARTICULAR FRAME THEN WE NEED TO FIND THE ELEMENT*/
		
		driver.switchTo().frame(0).findElement(By.linkText("YouTube")).click();
		driver.quit();
	}
}

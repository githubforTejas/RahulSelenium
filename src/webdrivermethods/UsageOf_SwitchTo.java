package webdrivermethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOf_SwitchTo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		
		int count=0;
		Set<String> wid = driver.getWindowHandles();
		for (String ids : wid) {
			count++;
			if (count>2) {
				WebDriver child = driver.switchTo().window(ids);
				System.out.println(child.getTitle());
				System.out.println(child.getCurrentUrl());
				Dimension size = child.manage().window().getSize();
				System.out.println("Size = " + size);
				child.manage().window().maximize();
				Thread.sleep(5000);
			}
		}
		driver.quit();
	}
}

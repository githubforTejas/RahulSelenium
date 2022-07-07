package Dynamic_Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Icc_Ranking {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/");
		WebElement rank = driver.findElement(By.xpath("//div[contains(.,'Rankings') and @class='global-navigation__link']"));
		Actions act = new Actions(driver);
		act.moveToElement(rank).perform();
		driver.findElement(By.linkText("Team Rankings")).click();
		List<WebElement> countryList = driver.findElements(By.xpath("//table[@class='table']/tbody/tr[*]/td[2]"));
		for (WebElement ele : countryList) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}
}

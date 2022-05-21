package popups;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdpopup_NextYearDate {
//PROGRAM TO SELECT NEXT YEAR'S DATE
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		int day = ldt.getDayOfMonth();
		String month = ldt.getMonth().name();
		int year = ldt.getYear();
		
		month = month.substring(0, 1).toUpperCase() + month.substring(1, 3).toLowerCase();
		//CONCATENING MONTH & YEAR FOR COMAPARISON
		String expectedMonthAndYear = month +" "+ year;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		outerloop:
		for(;;) {
			//STORING 2 MONT & YEARS IN CURRENT WIDGET
			List<WebElement> monthYearList = driver.findElements(By.className("month2"));
			//ITEARATING & COMPARING WHEATHER ANY ONE IS MATCHING TO expectedMonthAndYear
			for (WebElement ele : monthYearList) {
				if (ele.getText().equalsIgnoreCase(expectedMonthAndYear)) {
					driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//li[text()='"+day+"']")).click();
					break outerloop;
				}
			}
			//GO TO NEXT WIDGET IF expectedMonthAndYear IS NOT IN CURRENT WIDGET
		driver.findElement(By.id("img2Nex")).click();
		}
	}
}

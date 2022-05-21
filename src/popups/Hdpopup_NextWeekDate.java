package popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdpopup_NextWeekDate {
//PROGRAM TO SELECT NEXT WEEK'S DATE
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusWeeks(1);
		int day = ldt.getDayOfMonth();
		String month = ldt.getMonth().name();
		int year = ldt.getYear();
		
		month = month.substring(0, 1).toUpperCase() + month.substring(1, 3).toLowerCase();
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//li[text()='"+day+"']")).click();
	}
}

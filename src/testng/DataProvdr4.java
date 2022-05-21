package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvdr4 {
//PROGRAM TO RUN SAME TEST CASE MULTIPLE TIMES WITH MULTIPLE DATA
	@DataProvider(name="credentials")
	public String[][] testData(){
		String[][] sarr = {{"admin", "manager"}, {"trainee", "trainee"}, {"Rahul", "Rahul"}};
		//String [][] = ExcelLibrary.getMultipleData("Multiple");
		//IN THE ABOVE FIRST WE NEED TO CREATE ONE LIBRARY CLASS TO STORE MULTIPLE DATA
		return sarr;
	}
	
	@Test(dataProvider = "credentials")
	public void testMultipleLogins(String userData, String passwordData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys(userData);
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
	}
}

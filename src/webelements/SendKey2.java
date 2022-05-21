package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey2 {
	//PROGRAM TO UNDERSTAND HOW TO COPY, PASTE & DELETE 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(5000);
		WebElement userNameTextField = driver.findElement(By.name("username"));
		Thread.sleep(5000);
		userNameTextField.sendKeys("Rahul");
		Thread.sleep(5000);
		//TO SELECT THE USERNAME
		userNameTextField.sendKeys(Keys.CONTROL+"A");
		//To delete we can use DELETE or CLEAR or BACK_SPACE keys
		userNameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(5000);
		userNameTextField.sendKeys("admin");
		userNameTextField.sendKeys(Keys.CONTROL+"A");
		//TO COPY
		userNameTextField.sendKeys(Keys.CONTROL+"C");
		//TO PASTE IT IN USERNAME TEXTFIELD
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(5000);
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		driver.quit();

	}
}

package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jspopup_Prompt {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///C:/Users/rahul/Desktop/Property/Prompt.html");
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String expectedAlertText = "Enter Your Age";
		String actualAlertText = alert.getText();
		
		System.out.println("expectedAlertText: "+expectedAlertText);
		System.out.println("actualAlertText: "+actualAlertText);
		
		if (actualAlertText.equals(expectedAlertText)) {
			System.out.println("Pass:: Alert text is correct");
		} else {
			System.out.println("Fail:: Alert text is Incorrect");
		}
		 
		alert.sendKeys("90");
		alert.accept();
		//alert.dismiss();
		driver.quit();
	}
}

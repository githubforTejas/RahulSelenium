package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fupopup2 {
//PROGRAM TO UPLOAD A INVALID FILE & VERIFY ERROR MESSAGE IS CORRECT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.id("resumeUpload")).sendKeys("F:\\SOFTWARE\\JAVA\\java notes.pdf");
		
		String expectedErrorText = "Resume uploaded exceeds maximum file size limit (2 MB).";
		String actualErrorText = driver.findElement(By.xpath("//div[contains(@class,'resume-upload-container')]")).getText();
		
		System.out.println("expectedErrorText: "+expectedErrorText);
		System.out.println("actualErrorText: "+actualErrorText);
		
		if (actualErrorText.contains(expectedErrorText)) {
			System.out.println("PASS:: The Error Text Is Correct");
		} else {
			System.out.println("FAIL:: The Error Text Is InCorrect");
		}
		driver.quit();
	}
}

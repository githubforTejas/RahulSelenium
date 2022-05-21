 package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

public class Full_Page_ScreenShot {
//TO TAKE SCREENSHOT OF FULL WEB PAGE
	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(5000);
		HasFullPageScreenshot hs = (HasFullPageScreenshot) driver;
		File tempFile = hs.getFullPageScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String path = "./errorshots/" + timeStamp + "NaukriFullPage.png";
		
		FileUtils.copyFile(tempFile, new File(path));
		driver.quit();
		
		
	}
}

package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//DOWNCAST THE WEBDRIVER TYPE OBJECT INTO TAKESCREENSHOT TYPE
		TakesScreenshot ts = (TakesScreenshot) driver;
		//CALL getScreensotAs() returns File type object
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//PRINT THE PATH
		System.out.println(tempFile);
		//CALL THE LOCALDATETIME()
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String path = "./errorshots/" +timeStamp+ "fb.png";
		//COPY THE TEMP FILE TO PERMANENT FILE PATH
		FileUtils.copyFile(tempFile, new File(path));
		driver.quit();
	}
}

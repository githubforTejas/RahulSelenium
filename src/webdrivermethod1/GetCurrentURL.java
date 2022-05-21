package webdrivermethod1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String expectedUrl = "https://demo.actitime.com/login.do";
		System.out.println("expectedUrl: "+ expectedUrl);
		String actualURl = driver.getCurrentUrl();
		System.out.println("actualURl: "+ actualURl);
		if (actualURl.equals(expectedUrl)) {
			System.out.println("PASS :: THE LOGIN PAGE DISPLAYED");
		}else {
			System.out.println("FAIL:: THE LOGIN PAGE NOT DISPLAYED");
		}
		driver.quit();
	}
}

package webdrivermethod1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String expectedText = "Please identify yourself";
		System.out.println("expectedText : "+ expectedText);
		String actualText = driver.getPageSource();
		System.out.println("actualText : "+ actualText);
		if (actualText.contains(expectedText)) {
			System.out.println("PASS:: THE LOGIN PAGE DISPLAYED");
		}else {
			System.out.println("FAIL:: THE LOGIN PAGE NOT DISPLAYED");
		}
		driver.quit();
	}
}

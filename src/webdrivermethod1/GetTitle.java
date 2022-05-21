package webdrivermethod1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String expectedTitle = "actiTIME - Login";
		System.out.println("expectedTitle: "+ expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle : "+ actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("PASS :: THE LOGIN PAGE DISPLAYED");
		}else {
			System.out.println("FAIL :: THE LOGIN PAGE DISPLAYED");
		}
		driver.quit();
	}
}

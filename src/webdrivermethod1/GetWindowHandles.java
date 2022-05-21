package webdrivermethod1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String windowID = driver.getWindowHandle();
		System.out.println("windowID: "+ windowID);
		Set<String> windowIDS = driver.getWindowHandles();
		for (String ID : windowIDS) {
			System.out.println(ID);
		}
		driver.quit();
	}
}

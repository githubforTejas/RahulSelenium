package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin {
	public static void main(String[] args) throws Exception {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver=new ChromeDriver();
		//pass the main url
		driver.get("https://unifiedportal-mem.epfindia.gov.in/");
		Thread.sleep(1000);
		String expectedTitle = "Member Home";
		System.out.println("EXPECTED TITLE = "+ expectedTitle);
		//capture the title of web page
		String actualTitle = driver.getTitle();
		System.out.println("ACTUAL TITLE = " + actualTitle);
		//validate the login page by it's title
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The login page displayed");
		}else {
			System.out.println("Fail: The login page not dislayed");
		}
		driver.quit();
	}
}

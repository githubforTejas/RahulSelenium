package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver=new ChromeDriver();
		//pass the main url
		driver.get("https://test.testrail.net/");
		Thread.sleep(1000);
		String expectedUrl = "https://test.testrail.net/index.php?/auth/login/";
		System.out.println("expectedUrl = "+ expectedUrl);
		//capture the current url of login page
		String actualUrl = driver.getCurrentUrl();
		System.out.println("actualurl = " + actualUrl);
		//validate the login page by it's title
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Pass: The login page is displayed");
		}else {
			System.out.println("Fail: The login page not dislayed");
		}
		driver.quit();
	}

}

package webdrivermethods;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser{

	public static void main(String[] args) throws InterruptedException {
		// set the driver executable path
		System.setProperty("webdriver.edge.driver", "./drivers./msedgedriver.exe");
		//instantiate the browser specific class
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(1000);
		//pass the main url
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}

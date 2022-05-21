package pomtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.DashBoardPage;
import pom.HomePage;
import pom.LoginPage;
import pom.OrderDetailsPage;
import pom.ProductDetailsPage;
import pom.ProductsPage;

public class TC003VerifyProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/");
		
		LoginPage login = new DashBoardPage(driver).clickOnSignIn();
		HomePage home = login.Login("nameishemanth@gmail.com", "Testing@123");
		ProductsPage product = home.clickOnMenu("Dresses");
		ProductDetailsPage order = product.clickOnProduct("4");
		OrderDetailsPage orderDetails = order.addToCart(7, 3, "L", "Pink");
		if (orderDetails.isProductDisplayed("4")) {
			System.out.println("Pass:: Product is Displayed");
		} else {
			System.out.println("Fail:: Product is Not Displayed");
		}
		home.getSignOutLink().click();
		driver.quit();
	}
}

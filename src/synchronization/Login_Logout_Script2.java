package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Logout_Script2 {

	public static void main(String[] args) {
		//STEP-1 LAUNCH THE CHROME BROWSER
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//STEP-2 ENTER THE URL
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//STEP-3 TO VERIFY SIGN-UP PAGE IS DISPLAYED BY USING TITLE & URL
		String expectedSignUpTitle = "vtiger";
		String actualSignUpTitle = driver.getTitle();
		System.out.println("expectedSignUpTitle= " + expectedSignUpTitle);
		System.out.println("actualSignUpTitle= " + actualSignUpTitle);
		String expectedURL = "https://demo.vtiger.com/vtigercrm/";
		String actualURL = driver.getCurrentUrl();
		System.out.println("expectedURL= " + expectedURL);
		System.out.println("actualURL= " + actualURL);
		if ((actualURL.equals(expectedURL)) && (actualSignUpTitle.equals(expectedSignUpTitle))) {
			System.out.println("PASS::THE SIGN-UP PAGE DISPLAYED UPON VERIFICATION OF TITLE & URL");
		}else {
			System.out.println("FAIL::THE SIGN-UP PAGE NOT DISPLAYED UPON VERIFICATION OF TITLE & URL");
		}
		//STEP-4 ENTER THE USERNAME, PASSWORD & CLICK ON LOGIN
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		//STEP-5 TO VERIFY HOME PAGE DISPLAYED OR NOT
		String expectedHomeURL = "https://demo.vtiger.com/vtigercrm/index.php";
		String expectedHomeTitle = "Dashboard";
		try {
			wait.until(ExpectedConditions.urlToBe(expectedHomeURL));
			wait.until(ExpectedConditions.titleIs(expectedHomeTitle));
			String actualHomeTitle = driver.getTitle();
			String actualHomeURL = driver.getCurrentUrl();
			System.out.println("expectedHomeURL= " + expectedHomeURL);
			System.out.println("actualHomeURL= " + actualHomeURL);
			System.out.println("expectedHomeTitle= " + expectedHomeTitle);
			System.out.println("actualHomeTitle= " + actualHomeTitle);
			System.out.println("PASS::THE HOME PAGE IS DISPLAYED UPON VERIFICATION OF URL & TITLE");
		} catch (TimeoutException e) {
			System.out.println("FAIL::THE HOME PAGE IS NOT DISPLAYED UPON VERIFICATION OF URL & TITLE");
		}
		driver.findElement(By.xpath("//a[@class='userName dropdown-toggle pull-right']")).click();
		WebElement signOut = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		if (signOut.isDisplayed()) {
			System.out.println("PASS::THE SIGN OUT IS DISPLAYED");
		}else {
			System.out.println("PASS::THE SIGN OUT IS NOT DISPLAYED");
		}
		signOut.click();
		driver.quit();
	}
}

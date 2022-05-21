package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		//Step.1 Verify the tagname of username textfield
		String actualUserNameTagName = driver.findElement(By.id("username")).getTagName();
		System.out.println("actualUserNameTagName: " + actualUserNameTagName);
		if (actualUserNameTagName.equals("input")) {
			System.out.println("Pass::The username tagname is correct");
		}else {
			System.out.println("Fail::The username tagname is incorrect");
		}

		//Step.2 Verify the tagname of password textfield
		String actualPasswordTagName = driver.findElement(By.name("pwd")).getTagName();
		System.out.println("actualPasswordTagName: " + actualPasswordTagName);
		if (actualPasswordTagName.equals("input")) {
			System.out.println("Pass::The password tagname is correct");
		}else {
			System.out.println("Fail::The password tagname is incorrect");
		}

		//Step.3 Verify the tagname of checkbox
		String actualCheckboxTagName = driver.findElement(By.name("pwd")).getTagName();
		System.out.println("actualCheckboxTagName: " + actualCheckboxTagName);
		if (actualCheckboxTagName.equals("input")) {
			System.out.println("Pass::The checkbox tagname is correct");
		}else {
			System.out.println("Fail::The checkbox tagname is incorrect");
		}

		//Step.4 Verify the login button tagname is button or not
		String actualLoginButtonTagName = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println("actualLoginButtonTagName: " + actualLoginButtonTagName);
		if (actualLoginButtonTagName.equals("button")) {
			System.out.println("Pass::The tagname is correct");
		}else {
			System.out.println("Fail::The tagname is incorrect");
		}
		driver.quit();
	}
}

package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckAllOptions {
//TO PRINT ALL OPTIONS PRESENT IN DROPDOWN
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		//Identify the dropDown first
		WebElement dayDropDown = driver.findElement(By.id("day"));
		//Create an object for select class
		Select select = new Select(dayDropDown);
		List<WebElement> allOptions = select.getOptions();
		System.out.println("Total Days count= "+allOptions.size());
		for (WebElement ele : allOptions) {
			String visibleText = ele.getText();
			select.selectByVisibleText(visibleText);
			if (ele.isSelected()) {
				System.out.println(visibleText+" day is selected");
			} else {
				System.out.println(visibleText+" day is not selected");
			}
		}
		System.out.println("=============================================");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		//Create an object for select class
		Select select1 = new Select(monthDropDown);
		List<WebElement> allOptions1 = select1.getOptions();
		System.out.println("Total Months count= "+allOptions1.size());
		for (WebElement ele1 : allOptions1) {
			String visibleText1 = ele1.getText();
			select1.selectByVisibleText(visibleText1);
			if (ele1.isSelected()) {
				System.out.println(visibleText1+" month is selected");
			} else {
				System.out.println(visibleText1+" month is not selected");
			}
		}
		System.out.println("=============================================");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		//Create an object for select class
		Select select2 = new Select(yearDropDown);
		List<WebElement> allOptions2 = select2.getOptions();
		System.out.println("Total Years count= "+allOptions2.size());
		for (WebElement ele2 : allOptions2) {
			String visibleText2 = ele2.getText();
			select2.selectByVisibleText(visibleText2);
			if (ele2.isSelected()) {
				System.out.println(visibleText2+" year is selected");
			} else {
				System.out.println(visibleText2+" year is not selected");
			}
		}
		System.out.println("=============================================");
		driver.quit();
	}
}

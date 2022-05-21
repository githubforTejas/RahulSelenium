package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement femaleRadio = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type=\"radio\"]"));
		femaleRadio.click();
		if (femaleRadio.isSelected()) {
			System.out.println("Pass:: The Female Radio Button is Selected");
		}else {
			System.out.println("Fail:: The Female Radio Button is not selected");
		}
		
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type=\"radio\"]"));
		if (maleRadio.isSelected()) {
			System.out.println("Pass:: The Male Radio Button is Selected");
		}else {
			System.out.println("Fail:: The Male Radio Button is not selected");
		}
		
		WebElement customRadio = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input[@type=\"radio\"]"));
		if (customRadio.isSelected()) {
			System.out.println("Pass:: The Custom Radio Button is Selected");
		}else {
			System.out.println("Fail:: The Custom Radio Button is not selected");
		}
		driver.quit();
	}
}

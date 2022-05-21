package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserClassUserAndReports extends CrossBrowserMethodBaseTest {

	@Test
	public void testReports() throws InterruptedException {
		WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		Assert.assertTrue(reportsLink.isDisplayed(), "Reports Link Not Displayed");
		Assert.assertEquals(reportsLink.getText(), "Reports", "Reports Link Text Is Not Correct");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);    

		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title Is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do",
				"Reports Page URL is Not Correct");
	}
	
	@Test
	public void testUsers() throws InterruptedException {
		WebElement usersLink = driver.findElement(By.linkText("Users"));
		Assert.assertTrue(usersLink.isDisplayed(), "Users Link Not Displayed");
		Assert.assertEquals(usersLink.getText(), "Users", "Users Link Text Is Not Correct");

		((JavascriptExecutor)driver).executeScript("arguments[0].click();", usersLink);    
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - User List", "Users Page Title Is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/administration/userlist.do",
				"Users Page URL is Not Correct");
	}
}

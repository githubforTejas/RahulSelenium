package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserMethodReports extends CrossBrowserMethodBaseTest {

	@Test
	public void testReports() {
		WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		Assert.assertTrue(reportsLink.isDisplayed(), "Reports Link Not Displayed");
		Assert.assertEquals(reportsLink.getText(), "Reports", "Reports Link Text Is Not Correct");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);    

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Reports Dashboard']")));
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title Is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do",
				"Reports Page URL is Not Correct");
	}
}

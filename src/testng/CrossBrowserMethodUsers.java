package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserMethodUsers extends CrossBrowserMethodBaseTest {

	@Test
	public void testUsers() {
		WebElement usersLink = driver.findElement(By.linkText("Users"));
		Assert.assertTrue(usersLink.isDisplayed(), "Users Link Not Displayed");
		Assert.assertEquals(usersLink.getText(), "Users", "Users Link Text Is Not Correct");

		((JavascriptExecutor)driver).executeScript("arguments[0].click();", usersLink);    
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='List of Users']")));
		Assert.assertEquals(driver.getTitle(), "actiTIME - User List", "Users Page Title Is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/administration/userlist.do",
				"Users Page URL is Not Correct");
	}
}

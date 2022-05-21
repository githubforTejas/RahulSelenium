package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

	public DashBoardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Sign in")
	private WebElement signInLink;

	public WebElement getSignInLink() {
		return signInLink;
	}
	
	public LoginPage clickOnSignIn() {
		jse.executeScript("arguments[0].click()", signInLink);
		return new LoginPage(driver);
	}
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="passwd")
	private WebElement passwordField;
	
	@FindBy(linkText="Sign in")
	private WebElement signInButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	public HomePage Login(String emailId, String password) {
		emailTextField.sendKeys(emailId);
		passwordField.sendKeys(password);
		signInButton.click();
		return new HomePage(driver);
	}

	
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Login {

	@FindBy(id="txtUsername")
	private WebElement userNameTextField;
	
	@FindBy(id="txtPassword")
	private WebElement pwdTextField;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	public Orange_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameTexatField() {
		return userNameTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String userNameData, String passwordData) {
		userNameTextField.sendKeys(userNameData);
		pwdTextField.sendKeys(passwordData);
		loginButton.click();
	}
}

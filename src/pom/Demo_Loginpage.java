package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demo_Loginpage {
	@FindBy(id="username")
	private WebElement userNameTextField;
	
	@FindBy(name="pwd")
	private WebElement pwdTextField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement rememberCheckBox;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberCheckBox() {
		return rememberCheckBox;
	}	
}


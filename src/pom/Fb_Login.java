package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login {
//HERE WE ARE USING @FINDALL, IT IS USED TO IDENTIFY ELEMENT FROM MULTIPLE LOCATORS
//IF ONE FAILS ALSO OTHER LOCATOR IS USED
	public Fb_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(id="u_0_d_Wx"), @FindBy(name="login")})
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Logout {

	@FindBy(linkText="Buzz")
	private WebElement buzzLink;
	
	@FindBy(id="welcome")
	private WebElement menu;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	public Orange_Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBuzzLink() {
		return buzzLink;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void logout() {
		menu.click();
		logoutLink.click();
	}
}

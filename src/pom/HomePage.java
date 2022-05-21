package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Sign out")
	private WebElement signOutLink;
	
	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li/a")
	private List<WebElement> menuListLink;

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public List<WebElement> getMenuListLink() {
		return menuListLink;
	}

	public ProductsPage clickOnMenu(String menu) {
		for (WebElement ele : menuListLink) {
			if (ele.getText().equalsIgnoreCase(menu)) {
				ele.click();
				return new ProductsPage(driver);
			}
		}
		return null;
	}
}

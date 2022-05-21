package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fb_SignUp {
//WHENEVER WE NEED TO FIND ELEMENT BASED ON PARENT & CHILD THEN WE USE @FINDBYS
	public Fb_SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id="reg_box"), @FindBy(name="firstname")})
	private WebElement firstNameTextField;

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	
}

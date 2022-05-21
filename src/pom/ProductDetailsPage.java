package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage extends BasePage {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "icon-minus")
	private WebElement minusIcon;

	@FindBy(className = "icon-plus")
	private WebElement plusIcon;

	@FindBy(id = "group_1")
	private WebElement sizeListBox;

	@FindBy(xpath = "//ul[@id=\"color_to_pick_list\"]/li/a")
	private List<WebElement> colorList;

	@FindBy(name = "Submit")
	private WebElement addToCartButton;

	@FindBy(linkText = "Proceed to checkout")
	private WebElement proceedToCheckButton;

	public WebElement getMinusIcon() {
		return minusIcon;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getSizeListBox() {
		return sizeListBox;
	}

	public List<WebElement> getColorList() {
		return colorList;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getProceedToCheckButton() {
		return proceedToCheckButton;
	}
	
	public void clickPlusIcon(int plusCount) {
		for(int i=0; i<=plusCount; i++) {
			plusIcon.click();
		}
	}
	
	public void clickMinusIcon(int minusCount) {
		for(int i=0; i<=minusCount; i++) {
			minusIcon.click();
		}
	}
	
	public void selectSize(String size) {
		Select s = new Select(sizeListBox);
		s.selectByVisibleText(size);
	}
	
	public void clickOnColor(String colorName) {
		for (WebElement ele : colorList) {
			if (ele.getAttribute("name").equalsIgnoreCase(colorName)) {
				ele.click();
				break;
			}
		}
	}
	
	public OrderDetailsPage addToCart(int plusCount, int minusCount, String size, String colorName) {
		clickPlusIcon(plusCount);
		clickMinusIcon(minusCount);
		selectSize(size);
		clickOnColor(colorName);
		addToCartButton.click();
		proceedToCheckButton.click();
		return new OrderDetailsPage(driver);
	}
}

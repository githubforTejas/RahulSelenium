package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends BasePage {

	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//td[@class='cart_product']/a")
	private List<WebElement> allProductList;

	public List<WebElement> getAllProductList() {
		return allProductList;
	}
	
	public boolean isProductDisplayed(String productId) {
		productId="id_product"+productId;
		for (WebElement ele : allProductList) {
			if (ele.getAttribute("href").contains(productId)) {
				return true;
			}
		}
		return false;
	}
}

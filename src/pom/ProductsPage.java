package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="product_img_link")
	private List<WebElement> allProductList;

	public List<WebElement> getAllProductList() {
		return allProductList;
	}

	public ProductDetailsPage clickOnProduct(String ProductId) {
		for (WebElement ele : allProductList) {
			if (ele.getAttribute("href").contains(ProductId)) {
				jse.executeScript("arguments[0].click()", ele);
				return new ProductDetailsPage(driver);
			}
		}
		return null;
	}
}

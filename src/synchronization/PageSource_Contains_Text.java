package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//CREATING ANOTHER CUSTOM EXPECTED CONDITION
public class PageSource_Contains_Text implements ExpectedCondition<Boolean> {
	String expectedText;
	public PageSource_Contains_Text(String expectedText) {
		this.expectedText = expectedText;
	}
	
	@Override
	public Boolean apply(WebDriver driver) {
		return driver.getPageSource().contains(expectedText);
	}

	@Override
	public String toString() {
		return "Sorry, "+expectedText+" is not present in the pageSource";
	}
	
}

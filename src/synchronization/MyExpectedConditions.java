package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//CREATING CUSTOM EXPECTED CONDITIONS CLASS WHICH IS CLUBBED WITH LOT OF CUSTOM CONDITIONS
//WHICH IS NOT THERE IN EXPECTEDCONDITIONS CONCRETE CLASS 
public class MyExpectedConditions {

	public static ExpectedCondition<Boolean> myTitles(String expectedTitle) {

		return new ExpectedCondition<Boolean>() {
			String actualTitle;

			@Override
			public Boolean apply(WebDriver driver) {
				actualTitle = driver.getTitle();
				return actualTitle.equals(expectedTitle);
			}

			@Override
			public String toString() {
				return "Sorry, expectedTitle="+expectedTitle+", but actualTitle=+actualTitle";
			}
		};
	}

	public static ExpectedCondition<Boolean> PagesourceContainsText(String expectedText) {

		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return driver.getPageSource().contains(expectedText);
			}

			@Override
			public String toString() {
				return "Sorry, "+expectedText+" is not present in the pageSource";
			}
		};
	}
}

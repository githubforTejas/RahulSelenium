package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class My_Condition implements ExpectedCondition<Boolean> {
//IMPLENETED CUSTOM EXPECTEDCONDITION CLASS TO TAKE ARGUMENTS
//1.CREATE A PARAMETERIZED CONSTRUCTOR
//2.ASSIGN THE VALUES FROM CONSTRUCTOR TO GLOBAL VARIABLES
//3.USE THE SAME INITIALIZED VARIABLES IN apply() & toString() METHODS AS PER YOUR NEED
	String expectedTitle;
	String actualTitle;
	
	public My_Condition(String expectedTitle) {
		this.expectedTitle= expectedTitle;
	}
	@Override
	public Boolean apply(WebDriver driver) {
		actualTitle=driver.getTitle();
		return actualTitle.equals("Rahul");
	}
	
	@Override
	public String toString() {
		
		return "Sorry, expectedTitle="+expectedTitle+" , but actualTitle="+actualTitle;
	}
}

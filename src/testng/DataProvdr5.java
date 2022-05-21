package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvdr5 {
//PROGRAM TO RUN SAME TEST CASE MULTIPLE TIMES WITH MULTIPLE DATA	
	@DataProvider(name="courseDetails")
	public Object[][] testData(){
		//Object[][] arr = {{"Java", 10}, {"Selenium", 8}, {"SQL", 9}};
		return new Object[][]{{"Java", 10}, {"Selenium", 8}, {"SQL", 9}};
	}

	@Test(dataProvider = "courseDetails")
	public void getCourse(String courseName, int exp) {
		System.out.println("From Test Case: "+courseName);
		System.out.println("From Test Case: "+exp);
	}
}

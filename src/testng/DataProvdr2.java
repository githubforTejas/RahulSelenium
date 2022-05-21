package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvdr2 {
//PROGRAM TO RUN SAME TEST CASE MULTIPLE TIMES WITH MULTIPLE DATA       
	@DataProvider(name = "NumericValues")
	public Integer[] getData() {
		Integer[] usernames = {10, 20, 30, 40, 50};
		return usernames;
	}
	
	@Test(dataProvider = "NumericValues")
	public void intTest(int a) {
		System.out.println(a);
	}
}

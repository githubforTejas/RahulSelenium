package testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvdr3 {
//PROGRAM TO RUN SAME TEST CASE MULTIPLE TIMES WITH MULTIPLE DATA     
	@DataProvider(name = "getProducts")
	public Iterator<String> testData() {
		List<String> productIdsList = new ArrayList<>();
		productIdsList.add("id_Product=10");
		productIdsList.add("id_Product=20");
		productIdsList.add("id_Product=30");
		productIdsList.add("id_Product=40");
		productIdsList.add("id_Product=50");
		return productIdsList.iterator();
	}
	
	@Test(dataProvider = "getProducts")
	public void testProducts(String productID) {
		System.out.println("From Test Case: "+productID);
	}
}

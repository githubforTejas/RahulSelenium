package testng;

import org.testng.annotations.Test;

public class Group_Execution {

	@Test(groups = {"smoke", "customer"})
	public void createCustomer() {
		System.out.println("Running Create Customer Test Case");
	}
	
	@Test(groups = {"customer"})
	public void deleteCustomer() {
		System.out.println("Running Delete Customer Test Case");
	}
	
	@Test(groups = {"smoke", "project"})
	public void createProject() {
		System.out.println("Running Create Project Test Case");
	}
	
	@Test(groups = {"project"})
	public void deleteProject() {
		System.out.println("Running Delete Project Test Case");
	}
}

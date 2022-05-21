package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
//HERE WE 
	@Test
	public void login() {
		System.out.println("RUNNING LOGIN TEST CASE");
		Assert.fail("Login Unsuccessful");
		//HERE IF LOGIN FAILS MEANS BOTH TEST CASES ARE SKIPPED
	}
	
	@Test(dependsOnGroups = "login")
	public void addFriend() {
		System.out.println("RUNNING AddFriend TEST CASE");
		//Assert.fail("Login Unsuccessful");
		//HERE IF addFriend FAILS MEANS login TEST CASE WILL EXECUTE &
		//deleteFriend IS SKIPPED
	}
	
	@Test(dependsOnGroups = {"login", "addFriend"})
	public void deleteFriend() {
		System.out.println("RUNNING DeleteFriend TEST CASE");
	}
}

package testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "login")
	public void login() {
		System.out.println("RUNNING LOGIN TEST CASE");	
	}
	
	@Test(groups = "friend")
	public void addFriend() {
		System.out.println("RUNNING addFriend TEST CASE");	
	}
}

package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng8am {
	@Test(priority=3)
	
	public void m1() {
		System.out.println("m1-log");
		Reporter.log("m1-log");
	}
	@Test(priority=2)
	public void m3() {
		System.out.println("m2-log");
		Reporter.log("m2-log");

}
	@Test(priority=1)
	public void m4() {
		System.out.println("m2-log");
		Reporter.log("m2-log");

}@Test(priority=4)
	public void m2() {
		System.out.println("m2-log");
		Reporter.log("m2-log");

	}
}
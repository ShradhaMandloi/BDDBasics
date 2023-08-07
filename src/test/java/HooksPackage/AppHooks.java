package HooksPackage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {

	//@Before("@Profile")								// order for before is in ascending order
	//@Before("@CompaignFeature")
	@Before(order=1)
	public void beforehook() {
		System.out.println("Browser Open-Before hook is executing");
	}
//	@Before(order=2)
//	public void beforehook2(){
//		System.out.println("Browser loading");
//	}
	@After(order=2)									// order for after is in descending order
	public void afterhook() {
		System.out.println("Browser close-after hook is executing");
	}
//	@After(order=1)
//	public void afterhook2() {
//		System.out.println("Refresh after closing the browser");
//	}
//	
	@BeforeStep(order=1)							// order for beforestep is in ascending order
	public void beforestep() {
		System.out.println("beforestep is executing");
	}
//	@BeforeStep(order=2)
//	public void beforestep2() {
//		System.out.println("beforestep2 is executing");
//	}
	@AfterStep(order=2)								// order for aftestep is in descending order
	public void afterstep() {
		System.out.println("afterstep is executing");
	}
//	@AfterStep(order=1)
//	public void afterstep2() {
//		System.out.println("afterstep2 is executing");
//	}
	
}

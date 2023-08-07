package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("User is at the login screen")
	public void Preconditions() {
		System.out.println("Given Statement");
	}
	@When("User enters username")
	public void EnterUserName() {
		System.out.println("UserName Entered");
	}
	@When("User enters password")
	public void EnterPassword() {
		System.out.println("Password Entered");
	}
	@When("User click on login button")
	public void ClickOnLogin() {
		System.out.println("Clicked On Login button");
	}
	@Then("User should be on the home page")
	public void ValidateLogin() {
		System.out.println("Welecome to Home Page");
	}
	
	
//	@Given("User is at the login page")
//	public void NavToLoginPage() {
//		System.out.println("At Login Page");
//	}
	@Then("Page title should get display")
	public void ValidatePage() {
		System.out.println("Validate Page Title");
	}
	
	
	
	
}

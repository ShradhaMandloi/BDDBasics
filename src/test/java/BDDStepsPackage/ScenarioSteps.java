package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {

	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	    System.out.println("Signup Page");
	}

	@When("User enters the {string} on form")
	public void user_enters_the_on_form(String string) {
	   System.out.println("Enter Name:"+ string);
	}

	@When("User enters the {int} on form")
	public void user_enters_the_on_form(Integer int1) {
		 System.out.println("Enter Age:"+ int1);
	}

	@When("User selects the {string}")
	public void user_selects_the(String string) {
		 System.out.println("Enter Gender:"+ string);
	}

	@Then("User id get generate")
	public void user_id_get_generate() {
		 System.out.println("User Id Generated");
	}

	
}

package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

	@Given("User should on home page")
	public void user_should_on_home_page() {
	   System.out.println("This is my given statement");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	   System.out.println("When for add information");
	}

	@When("User enters the information")
	public void user_enters_the_information() {
		System.out.println("add information");
	}

	@Then("Profile should be created")
	public void profile_should_be_created() {
		System.out.println("profile created");
	}

	@When("User clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
		System.out.println("When for edit information");
	}

	@When("User update the information")
	public void user_update_the_information() {
		System.out.println("update information");
	}

	@Then("Profile should be updated")
	public void profile_should_be_updated() {
		System.out.println("profile updated");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
		System.out.println("When for delete information");
	}

	@Then("Profile should be deleted")
	public void profile_should_be_deleted() {
		System.out.println("Profile deleted");
	}

	
}

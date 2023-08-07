package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompaignSteps {


@Given("User should be logged into system")
	public void givenstatement() {
	   System.out.println("Given Statement of 1st Scenario");
	}	
	
@When("User should click on create compaign button")
public void user_should_click_on_create_compaign_button() {
   System.out.println("When Statement of 1st Scenario");
}

@When("User enter name of compaign")
public void user_enter_name_of_compaign() {
	System.out.println("Name Of Compaign");
}

@Then("Compaign gets created")
public void compaign_gets_created() {
	System.out.println("Compaign created");
}

@When("User select a date for compaign")
public void user_select_a_date_for_compaign() {
	System.out.println("Date of comapign");
}

@When("Enter other details for scheduling a compaign")
public void enter_other_details_for_scheduling_a_compaign() {
	System.out.println("Other details for scheduling");
}

@Then("Compaign schedule")
public void compaign_schedule() {
	System.out.println("Compaign schedule");
}

@When("User clicks on review to validate all details")
public void user_clicks_on_review_to_validate_all_details() {
	System.out.println("Review details of compaign");
}

@Then("Compaign validated")
public void compaign_validated() {
	System.out.println("Compaign gets Validated");
}
	
	
	
}

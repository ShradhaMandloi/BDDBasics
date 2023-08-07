package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;
public class DataTableRegistrationSteps {

	@Given("User should be at registration page")
	public void user_should_be_at_registration_page() {
	    System.out.println("This is Given registration Page");
	}

	@When("User enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
		
		List<List<String>> data=dataTable.asLists();
//		List<String> firstindex =data.get(0);
//		String value=firstindex.get(2);
//		System.out.println(value);
		
		//Second way
		String  value=data.get(0).get(1);
		System.out.println(value);
		
	}

	@Then("User should get registration confirmation")
	public void user_should_get_registration_confirmation() {
	    System.out.println("Confirmation Send");
	}
	
}

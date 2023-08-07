package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {


@Given("User is at login page")
public void user_is_at_login_page() {
    System.out.println("This is my given statement");
}

@When("User enter the username as {string}")
public void user_enter_the_username_as(String Uname) {
    System.out.println("Enter Username is:"+Uname);
}

@When("User enter the password as {string}")
public void user_enter_the_password_as(String Pwd) {
	System.out.println("Enter Password is:"+Pwd);
}
@When("User click on the login button")
public void clickOnLogin() {
	System.out.println("click on login");
}
@Then("User should be on home page")
public void user_should_be_on_home_page() {
   System.out.println("Home Page");
}

	
}

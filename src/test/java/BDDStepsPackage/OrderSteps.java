package BDDStepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {


@Given("User should be logged in")
public void user_should_be_logged_in() {
   System.out.println("This is given statement for login");
}

@When("User clicks on orders link")
public void user_clicks_on_orders_link() {
   System.out.println("Click On Orders");
}

@When("User clicks on past order button")
public void user_clicks_on_past_order_button() {
    System.out.println("Click On Past Order");
}

@Then("User should beable to see past order")
public void user_should_beable_to_see_past_order() {
    System.out.println("Past Order Information");
}

@When("User clicks on current order button")
public void user_clicks_on_current_order_button() {
    System.out.println("Click On Current Order");
}

@Then("User should able to see current order")
public void user_should_able_to_see_current_order() {
    System.out.println("Current Order Information");
}


}

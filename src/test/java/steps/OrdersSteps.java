package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
//	CTRL + Shift + O
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	  System.out.println("Given statement for login");
	}

	@When("User clicks on orders link")
	public void user_clicks_on_orders_link() {
	  System.out.println("When statement to click on order link");
	}

	@Then("user should redirect to orders page")
	public void user_should_redirect_to_orders_page() {
	  System.out.println("Then statement for redirection to orders page");
	}

	@When("user clicks on the past orders button")
	public void user_clicks_on_the_past_orders_button() {
	   System.out.println("When statement for past order");
	}

	@Then("user should be able to see past order information")
	public void user_should_be_able_to_see_past_order_information() {
	   System.out.println("Then statement for past information"); 
	}

	@When("user clicks on the current orders button")
	public void user_clicks_on_the_current_orders_button() {
		System.out.println("When statement for current order");
	}

	@Then("user should be able to see placed order information")
	public void user_should_be_able_to_see_placed_order_information() {
		System.out.println("Then statement for current information"); 
	}


}

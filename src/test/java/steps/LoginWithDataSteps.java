package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {

	@Given("User is at login page")
	public void user_is_at_login_page() {
	   System.out.println("Given statement");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String value) {
	   System.out.println("When statement and value is "+value);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String value) {
		System.out.println("When statement for password and value is "+value);
	}
	

@When("User clicks on login {int} button")
public void user_clicks_on_login_button(Integer int1) {
    System.out.println("When statement for click on login button with argument :"+int1);
}

	@Then("User should gets logged into the app")
	public void user_should_gets_logged_into_the_app() {
	   System.out.println("Then statement");
	}
	
}

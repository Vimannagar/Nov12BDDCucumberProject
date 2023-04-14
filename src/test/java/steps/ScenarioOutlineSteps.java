package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	   System.out.println("Given statement");
	}

	@When("User enters {string} on form")
	public void user_enters_on_form(String name) {
	    System.out.println("When statement for name " + name);
	}

	@When("User enters {string} inside the form")
	public void user_enters_inside_the_form(String age) {
	  System.out.println("When statement for Age "+age);
	}

	@When("User confirms the {string} inside form")
	public void user_confirms_the_inside_form(String gender) {
	    System.out.println("When statement for Gender"+gender);
	}

}

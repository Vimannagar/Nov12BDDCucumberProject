package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at login screen")
	public void preconditions()
	{
		System.out.println("This is my given statement");
	}
	
	@When("User enters username")
	public void enterUsername()
	{
		System.out.println("When statement for entering username");
	}
	
	@When("User enters password")
	public void enterPassword()
	{
		System.out.println("When statement for entering password");
	}
	
	@When("User clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("When statement for clicking on login button");
	}
	
	@Then("User should get redirect to home page")
	public void validateOnHomePage()
	{
		System.out.println("Then statement for home page");
	}

	@When("User get the title of page")
	public void user_get_the_title_of_page() {
	    System.out.println("When statement for title of page");
	}

	@Then("Page title should be verified")
	public void page_title_should_be_verified() {
	   System.out.println("Then statement for title verification");
	}

}

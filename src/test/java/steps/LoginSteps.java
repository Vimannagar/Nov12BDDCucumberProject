package steps;

import io.cucumber.java.en.Given;
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
	

}

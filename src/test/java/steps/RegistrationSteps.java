package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	

@Given("user should be at registration page")
public void user_should_be_at_registration_page() {
    System.out.println("Given statement");
}

@When("user enters the following data")
public void user_enters_the_following_data(DataTable dataTable) {
    
	
	List<List<String>> data = dataTable.asLists(String.class);
	
	
	List<String> firstindexlist = data.get(0);
	
	String lastname = firstindexlist.get(1);
	
	System.out.println(lastname);
	
//	WAP to print the complete list at second number
	
	
	List<String> secondindexlist = data.get(1);
	
	System.out.println(secondindexlist);
	
	
	
}

@Then("user gets registration confirmation")
public void user_gets_registration_confirmation() {
    System.out.println("Then statement");
}

}

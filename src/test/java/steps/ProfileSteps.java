package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	

@Given("user is at the home page")
public void user_is_at_the_home_page() {
   System.out.println("Given statement");
}

@When("user click on the add profile button")
public void user_click_on_the_add_profile_button() {
   System.out.println("When statement for add profile");
}

@When("user provides the information")
public void user_provides_the_information() {
	 System.out.println("When statement for adding information");
}

@Then("profile gets created")
public void profile_gets_created() {
	 System.out.println("Then statement for add profile");
}

@When("user click on the edit profile link")
public void user_click_on_the_edit_profile_link() {
	 System.out.println("When statement for edit profile");
}

@When("user updates the information")
public void user_updates_the_information() {
	 System.out.println("When statement for update profile");
}

@Then("profile gets updated")
public void profile_gets_updated() {
	 System.out.println("Then statement for edit profile");
}

@When("user click on the delete profile link")
public void user_click_on_the_delete_profile_link() {
	 System.out.println("When statement for delete profile");
}

@When("user confirms delete")
public void user_confirms_delete() {
	 System.out.println("When statement confirm delete profile");
}

@Then("profile gets deleted")
public void profile_gets_deleted() {
	 System.out.println("Then statement for delete profile");
}

}

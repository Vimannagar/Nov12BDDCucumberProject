package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePicSteps {
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("Given statement");
	}

	@When("user click on the avatar")
	public void user_click_on_the_avatar() {
	   System.out.println("When statement for add");
	}

	@When("user selects the image to upload")
	public void user_selects_the_image_to_upload() {
		 System.out.println("When statement to select file for add");
	}

	@Then("profile picture gets uploaded")
	public void profile_picture_gets_uploaded() {
		 System.out.println("then statement for add");
	}

	
	@When("user click edit for avatar")
	public void user_click_edit_for_avatar() {
		 System.out.println("When statement for edit");
	}

	@When("user updates the picture")
	public void user_updates_the_picture() {
		System.out.println("When statement to select file for edit");
	}

	@Then("profile picture gets updated")
	public void profile_picture_gets_updated() {
		 System.out.println("Then statement for edit");
	}

	@When("user click on the delete profile picture link")
	public void user_click_on_the_delete_profile_picture_link() {
		 System.out.println("When statement for delete");
	}

	@When("user confirms delete picture")
	public void user_confirms_delete_picture() {
		 System.out.println("When statement for confirm delete");
	}

	@Then("profile picture gets deleted")
	public void profile_picture_gets_deleted() {
		 System.out.println("Then statement for delete");
	}

}

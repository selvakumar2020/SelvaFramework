package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	

		@Given("User is on landing page")
		public void user_is_on_landing_page() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Given statement Executed successfully");
			System.out.println("newly added in 11:17");
			System.out.println("newly added in 11:18");
			System.out.println("newly added in 11:19");
			
			System.out.println("newly added in 11:27");
			System.out.println("selva framework 18:18");
			System.out.println("selva final commit 18:25");
			
		}

		@When("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\" and click the submit button$")
	    public void enter_the_username_something_and_password_something_and_click_the_submit_button(String username, String password) throws Throwable {
	        System.out.println("When steps:"+username);
	        System.out.println("When Steps passwrod:"+password);
	        System.out.println("newly added in 11:27");
			System.out.println("newly added in 11:28");
			
			
	    }
		
		@Then("Login Home page displayed successfully")
		public void login_Home_page_displayed_successfully() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Then Statement executed successfully");
		    System.out.println("branch developone code");
			System.out.println("branch developone 1842");
		}
		
		@Then("Login Home page displayed successfully1")
		public void login_Home_page_displayed_successfully1() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Then Statement executed successfully");
		    System.out.println("branch developone code");
		}
		
		
		}




	
}

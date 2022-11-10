package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
 

public class AddCoach extends SeleniumFunctions {

	AddCoachMethods add = new AddCoachMethods();
	
	
	@Then("Admin Navigates to users>coaches")
	public void admin_navigates_to_coaches() throws Exception {

		
		add.navigate_to_coach_page();
		
		
	}

	@Given("Admin clicks on add new coach")
	public void admin_clicks_on_add_new_coach() throws Exception {

		add.clickaddnewcoach();
		
	}
	
	 

	@Given("Admin fills {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void admin_fills(String username_email, String newpassword_coach,String conformpassword, String fname, String lastname, String DOB,
			String gender, String mobphone,String mailingaddress,String code) throws Exception {
	 
	add.fill_details(username_email, DOB, newpassword_coach, fname, lastname, gender, code, mobphone, mailingaddress);
		
		
	}

	@Then("Admin clicks on save button")
	public void admin_clicks_on_save_button() throws Exception {

		
	add.clicksavebutton();
		 
		
		
	}

	 

	@Then("All information will be saved on admin portal")
	public void all_information_will_be_saved_on_admin_portal() {

				
	}

}

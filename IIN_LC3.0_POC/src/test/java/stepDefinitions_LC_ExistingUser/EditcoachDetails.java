package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditcoachDetails extends SeleniumFunctions {

	EditCoachMethods edit = new EditCoachMethods();

	@Then("Admin searches new {string}")
	public void admin_searches_new_coach(String coachname) throws Exception {

		edit.adminsearchnewcoach(coachname);

	}

	@Given("Admin changes {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void admin_fills(String username_email, String newpassword_coach, String conformpassword, String fname,
			String lastname, String DOB, String gender, String mobphone, String mailingaddress, String code)
			throws Exception {

		edit.Fillnewcoachdetails(fname, lastname, DOB, gender, mobphone);

	}

	@Then("Admin clicks on save button and close window")
	public void admin_clicks_on_save_button() throws Exception {

		edit.savebuttonafterEditimgDetails();

	}

}
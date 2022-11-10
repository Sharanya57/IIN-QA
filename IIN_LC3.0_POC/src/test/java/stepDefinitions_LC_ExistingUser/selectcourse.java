package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selectcourse extends SeleniumFunctions {
	
	@When("Student clicks and select courseandlanguage from Language and Program track field dropdown")
	public void student_clicks_and_select_from_language_and_program_track_field_dropdown() throws Exception {
		  //Select Course and language from the dropdown
		  Page("CourseandLanguage").clickElement("IINCourseLanguagedropdown");
		  Page("CourseandLanguage").clickElement("SelectingProgram");

		  
 
	}
	@When("Student Clicks the {string} button")
	public void student_clicks_the_button(String Next) throws Exception {
		//Click on the Next Button
		
		  Page("CourseandLanguage").clickElement("IINNext");
  
	}
	@Then("Student Navigates to {string} page.")
	public void student_navigates_to_page(String string) {
	    
	}



}

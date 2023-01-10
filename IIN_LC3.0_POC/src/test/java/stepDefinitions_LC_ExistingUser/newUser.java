package stepDefinitions_LC_ExistingUser;

import com.core.TestProperties;
import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newUser extends SeleniumFunctions {
	String Email;
	
	@When("user takes one Email from the fakemail website")
	public void user_takes_one_Email_from_the_fakeemail_website() throws Exception {


		try {
			NavigateToURL(TestProperties.getInstance().getEmailUrl());
			LoadApplication();
			 Email=Page("fakeemail").GetElementText("Emailvalue1");
			// Email=Page("fakeemail").GetElementAttribute("Emailvalue1", "value");
			 Page("fakeemail").setValue(Email);
		} catch (Exception e) {

		}
	
	}
	
	@When("Student is on Student Portal")
	public void Student_is_on_Student_Portal() throws Exception {


		try {
			NavigateToURL(TestProperties.getInstance().getBaseUrl_Studentlogin());
			LoadApplication();
		} catch (Exception e) {

		}
	
	}
	
	
	
	
	
	
	@When("Student Enters the Username")
	public void Student_Enters_the_Username() throws Exception {
		
//		Page("LoginPage").tripleClickElement("UsernameEmail");

		Page("LoginPage").clickElement("UsernameEmail");
		//Page("LoginPage").clickElement("IINOpenGender");
		Page("LoginPage").sendKeysToElement("UsernameEmail", Email);
		
	Thread.sleep(5000);
		
	}
	
	
	

	@When("Student Clicks on {string} Button")
	public void student_clicks_on_button(String string) throws InterruptedException {
		Page("LoginPage").CompleteButtonClick();
		Thread.sleep(5000);
		
	}
	



	
	

	@Then("Student Navigates to {string} page")
	public void student_navigates_to_page(String string) {
	   
	}



}
 

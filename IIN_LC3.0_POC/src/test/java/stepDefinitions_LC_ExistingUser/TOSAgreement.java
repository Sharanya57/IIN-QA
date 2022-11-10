package stepDefinitions_LC_ExistingUser;

import org.testng.Assert;

import com.core.TestProperties;
import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TOSAgreement extends SeleniumFunctions {
	
	@Given("Student is on Existing Student Portal")
	public void student_is_on_existing_student_portal() {
		try {
			// Launching the url in browser
			NavigateToURL(TestProperties.getInstance().getBaseUrl_Studentlogin());
			LoadApplication();
		} catch (Exception e) {

		}
	}   
	@When("Student Enters the Username and password")
	public void student_enters_the_username_and_password() throws Exception {
		String username=Page("AdminPortalLogin").getValue();
		// click on email box
				Page("LoginPage").clickElement("UsernameEmail");
				// Entering email
				Page("LoginPage").sendKeysToElement("UsernameEmail", username);
				// clicking on continue button
				Page("LoginPage").clickElement("ContinueButton");
				// clicking on password textbox
				Page("LoginPage").clickElement("UserPassword");
				// Entering password
				Page("LoginPage").sendKeysToElement("UserPassword", "Subh@1987");

	    
	}
	@When("Student Clicks on Continue Button")
	public void student_clicks_on_continue_button() throws Exception {
		// clicking continue button
		Page("LoginPage").RefreshBrowser();
		Thread.sleep(5000);
				Page("LoginPage").clickElement("ContinueButton"); 
	}
	@When("Student clicks on the Sign button")
	public void student_clicks_on_the_sign_button() throws Exception {
		Page("LoginPage").clickElement("SignButton");   
	}
	@When("Student  navigates to the Agreement page")
	public void student_navigates_to_the_agreement_page() {
	    
	}
	@When("Student Sign the Agreement")
	public void student_sign_the_agreement() throws Exception {
		Page("ReadandSignAgreement").clickElement("iAgreebutton");
	}
	@When("Student Signed the agreement")
	public void student_signed_the_agreement() throws Exception {
		Page("ReadandSignAgreement").clickElement("continueButton");
		Page("ReadandSignAgreement").clickElement("startButton");
		Page("ReadandSignAgreement").clickElement("signInboxButton");
		Page("ReadandSignAgreement").clickElement("adoptAndsignButton");
	}
	@When("clicks on the finish button and click on the Complete Button")
	public void clicks_on_the_finish_button_and_click_on_the_Complete_Button()  throws Exception {
		Page("ReadandSignAgreement").clickElement("finishTabbutton");
		Thread.sleep(5000);
		//Page("LoginPage").RefreshBrowser();
		//Page("LoginPage").CompleteButtonClick();
		Page("LoginPage").clickElement("CompleteButton");
	}
	@Then("Student should be able to navigate to the My Course page.")
	public void student_should_be_able_to_navigate_to_the_my_course_page() throws Exception {
		String pagename=Page("LoginPage").GetElementText("MyCourseiin");
		Assert.assertEquals("My Courses", pagename);
	}



}

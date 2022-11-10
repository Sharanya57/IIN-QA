package stepDefinitions_LC_ExistingUser;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.core.TestProperties;
import com.seleniumFuctions.LocatorType;
import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoachView extends SeleniumFunctions {

	CoachViewMethods Coach=new CoachViewMethods();
	

	@Given("Coach is on Student Portal Login page")
	public void coach_is_on_student_portal_login_page() {
		try {
			// Launching the url in browser
			NavigateToURL(TestProperties.getInstance().getBaseUrl_Studentlogin());
			LoadApplication();
		} catch (Exception e) {

		}
	}
	@When("coach enters {string} and {string}")
	public void coach_enters_and(String Coachusername, String Coachpassword) throws Exception {
		Page("CoachView").clickElement("CoachUsername");
		// Entering email
		Page("CoachView").sendKeysToElement("CoachUsername", Coachusername);
		// clicking on continue button
		Page("CoachView").clickElement("CoachContinue");
		// clicking on password textbox
		Page("CoachView").clickElement("CoachePassword");
		// Entering password
		Page("CoachView").sendKeysToElement("CoachePassword", Coachpassword);

	}
	@When("clicks on the Continue button")
	public void clicks_on_the_continue_button() throws Exception {
		Page("CoachView").clickElement("CoachContinue"); 
		//Thread.sleep(3000);
	}
	@When("Coach directs to the {string} page")
	public void coach_directs_to_the_page(String pagename1) throws Exception {
	  String S1= Page("CoachView").GetElementText("MyCoachingCirclestext");
	  // pagename1="MY COACHING CIRCLES"; 
	  System.out.println( S1.equalsIgnoreCase(pagename1));
	   //Assert.assertEquals(S1, pagename1);
	  Assert.assertTrue(S1.equalsIgnoreCase(pagename1));
	}

	

	@When("verify Coach able to navigate to all the {string}")
	public void verify_all_the_coaching_circles_present_on_the_my_coaching_circles(String reviewcc) throws Exception {
		Coach.clickonlistofcoachingcircle();
		
	}

	

	@When("again click on the {string}")
	public void again_click_on_the(String string) throws Exception {
		Page("CoachView").clickElement("ReviewCC1"); 
	}

	
	@When("click on the View details link")
	public void click_on_the_view_details_link() throws Exception {
		Page("CoachView").clickElement("Viewdetails");
		//Page("CoachView").ScrollDown();
	}

	

	@When("click on the Sessions tab")
	public void click_on_the_sessions_tab() throws Exception {
		Page("CoachView").clickElement("Sessions");
		//Page("CoachView").ScrollDown();
	}
	@When("click on the Students tab")
	public void click_on_the_students_tab() throws Exception {
		Page("CoachView").clickElement("CCStudents"); 
		Page("CoachView").ScrollDown();
	}

	

	@Then("logout from Student portal")
	public void logout_from_student_portal() throws Exception {
		Page("CoachView").clickElement("ProfileICON");
		Page("CoachView").clickElement("logout");
	}








}

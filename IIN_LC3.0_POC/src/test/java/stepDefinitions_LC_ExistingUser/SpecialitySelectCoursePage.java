package stepDefinitions_LC_ExistingUser;

import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpecialitySelectCoursePage extends SeleniumFunctions {
	String Email;

@When("Student select any course from specialty courses \\(Bundle, WPH, DYL)")
public void student_select_any_course_from_specialty_courses_bundle_wph_dyl() throws Exception
 {
	Thread.sleep(500);
	Page("SpecialitySelectCoursePage").clickElement("selectDYLcourse");
    
	
}
@When("Student clicks on {string} Button")
public void student_clicks_on_button(String string) throws Exception
{
	Thread.sleep(800);
	Page("SpecialitySelectCoursePage").clickElement("nextButton");
   
}
   
@Then("Student redirects to {string} page")
public void student_redirects_to_page(String pagename) throws Exception {
	Thread.sleep(2000);
	String text= Page("ReadandSignAgreement").GetElementText("TOS");
	
	Assert.assertEquals(text, pagename);	
}
}


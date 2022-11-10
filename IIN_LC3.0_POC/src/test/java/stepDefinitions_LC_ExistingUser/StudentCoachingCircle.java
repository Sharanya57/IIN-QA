package stepDefinitions_LC_ExistingUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import stepDefinitions_LC_ExistingUser.StudentClass.StudentClass;

import com.seleniumFuctions.SeleniumFunctions;
import com.core.TestProperties;

public class StudentCoachingCircle extends SeleniumFunctions {
	StudentClass coaching = new StudentClass();
	
	@And("Student Clicks {string}")
	public  void student_clicks_myCourse(String string) throws Exception {
					coaching.clickMyCourse(string);
						}

	@And("Clicks on {string} tab")

	public  void student_clicks_coachingCircle(String string) throws Exception {
			coaching.clickCoachingCircleTab(string);
			}
	
	@And("Clicks on {string} radio button")

	public  void student_clicks_radiobutton(String string) throws Exception {
			coaching.selectCoachingCircleradiobutton(string);
			}
				
	@And("Selects the {string}{string}")

	public  void student_selects_coach(String selectCoach,String coachName) throws Exception {
			coaching.selectCoach(selectCoach,coachName);
			}
				
	@And("Clicks on {string}")

	public  void student_submit(String string) throws Exception {
			coaching.selectCoachSubmit(string);
			}
				
	

@When("User click on click here for {string}")
public void user_click_on_click_here_for(String string) throws Exception {
   coaching.clickhere();
}

@When("select  any different {string}{string}")
public void select_any_different(String selectCoach2,String coachName2) throws Exception {
	coaching.selectCoach2(selectCoach2,coachName2);
}


@When("click confirm")
public void click_confirm() throws Exception {
	coaching.clickconfirm();
   
}

@When("Click on Web URL link for {string}")
public void click_on_web_url_link_for(String string) throws Exception {
	coaching.clickURL();
   
}
}
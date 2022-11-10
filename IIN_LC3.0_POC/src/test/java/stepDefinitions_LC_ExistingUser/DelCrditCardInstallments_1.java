package stepDefinitions_LC_ExistingUser;

import io.cucumber.java.en.Then;

public class DelCrditCardInstallments_1 {
	DelCrditCardInstallments_2 DelCC=new DelCrditCardInstallments_2();

	

	@Then("student removes the Credit card")
	public void student_removes_the_credit_card() throws Exception {
	    DelCC.removeCC();
	}



//	@Then("Student checks {string} on pop up box")
	//public void student_checks_on_pop_up_box(String pagename) throws Exception {
	  // DelCC.validationtext(pagename);
	//}

	@Then("Student click {string} button")
	public void student_click_button(String string) throws Exception {
	   DelCC.clickGotit();
	}



}
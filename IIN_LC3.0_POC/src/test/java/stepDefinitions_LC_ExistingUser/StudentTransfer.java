package stepDefinitions_LC_ExistingUser;



import com.core.TestProperties;

//import com.core.TestProperties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentTransfer  {
TransfersStudent transfer=new TransfersStudent();








@Then("Admin clicks on the {string} tab")
public void admin_clicks_on_the_tab(String string) throws Exception {
	transfer.clickUser(); 
    
}




	@Then("clicks on {string} tab")
	public void admin_clicks_Student_tab(String string) throws Exception {
		
		transfer.clickAdminStudent();
	}

	

	@When("click on the Studentsearch button")
	public void click_on_the_studentsearch_button() throws Exception {
	   transfer.searchStudent();
	}

	
	

	@When("enter {string} in search button")
	public void enter_in_search_button(String string) throws Exception {
	    transfer.enterStudent(string);
	}

	

	@When("click on the faceicon")
	public void click_on_the_faceicon() throws Exception {
	   transfer.clickfaceicon();
	    
	}
	

//	@When("search the user with {string}")
//	public void search_the_user_with(String string) throws Exception {
//	    transfer.clickusername();
//	}
	@When("click on cross icon in the pop up window")
	public void click_on_cross_icon_in_the_pop_up_window() throws Exception {
	  transfer.clickcross();  
	}
	@When("click on the face icon again")
	public void click_on_the_face_icon_again() throws Exception {
	    transfer.clickfaceicon();
	}


	

	@When("click on the {string} tab")
	public void click_on_the_tab(String string) throws Exception {
	   transfer.clickpaymenttab();
	}


	@When("clicks on the {string} tab")
	public void clicks_on_the_tab(String string) throws Exception {
	   transfer.clickplantab();

	}

	

	@When("Admin clicks on Transferstudent tab")
	public void admin_clicks_on_transferstudent_tab() throws Exception {
	    transfer.clicktransfertab();
	}

	

	@When("Admin selects cohort from {string} dropdown")
	public void admin_selects_cohort_from_dropdown(String string) throws Exception {
	    transfer.clickcohortlistfromdropdown();
	    transfer.selectcohortlistfromdropdown();
	}


	

	@When("Admin click on the Selectpaymentplan tab")
	public void admin_click_on_the_selectpaymentplan_tab() throws Exception {
	    transfer.clickpaymentplanlistfromdropdown();
	}
	@When("Admin select {string}")
	public void admin_select(String string) throws Exception {
		transfer.selectpaymentplanlistfromdropdown();
	    
	}
	@When("Admin enter {string}")
	public void admin_enter(String string) throws Exception {
	   transfer.entercommentfortransfer();
	}
	
	

	@When("clicks on the Transfer button")
	public void clicks_on_the_transfer_button() throws Exception {
	    transfer.TransferButton();
	}



	
	
	@When("login as existing user on Student portal")
	public void login_as_existing_user_on_student_portal() {
		
	
	}






//	@When("login as Student portal")
	
//	public void login_as_Student_portal() {
//		transfer.loginstudentportal();
//
//
//
//}
}

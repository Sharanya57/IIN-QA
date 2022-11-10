package stepDefinitions_LC_ExistingUser;


import io.cucumber.java.en.When;

public class StudentWithdrawal_1 {
	StudentWithdrwal_2 Withdrwal=new StudentWithdrwal_2();
	


	@When("Admin Clicks on user tab")
	public void admin_clicks_on_user_tab() throws Exception {
	 Withdrwal.clickusertab();
		
	}
	

	@When("Admin Clicks on student face icon")
	public void admin_clicks_on_student_face_icon() throws Exception {
	   Withdrwal.clickstudenttab();
	}


	@When("Admin clicks on Search bar")
	public void admin_clicks_on_search_bar() throws Exception {
	    Withdrwal.clicksearchbar();
		
	}
	
	@When("Admin enters {string} of student")
	public void admin_enters_of_student(String string) throws Exception {
	    Withdrwal.enteruserid(string);
		
	}

	@When("Admin Clicks on avatar")
	public void admin_clicks_on_avatar() throws Exception {
		Withdrwal.clickavatar();
	    
		
	}
	
	@When("Admin Clicks on {string} tab")
	public void admin_Clicks_on_tab(String string) throws Exception {
		Withdrwal.clickpaymentinfobutton();
	    
		
	}
	@When("Admin clicks on {string} tab")
	public void admin_clicks_on_tab(String string) throws Exception {
		Withdrwal.clickpaymentplanTermButton();
	    
		
	}
	@When("Admin clicks on  {string} tab")
	public void admin_clicks_on_(String string) throws Exception {
		Withdrwal.clickwdstudent();
	}
	
	@When("Admin select {string} from dropdown")
	public void admin_select_from_dropdown(String string) throws Exception {
	    Withdrwal.clickwithdrwalreason();
	    Withdrwal.selectwdresonlfromlist();
	  
	}
	
	@When("Admin Selct {string} from dropdown")
	public void admin_selct_from_dropdown(String string) throws Exception {
		Withdrwal.clickwdreasondetailtab();
		Withdrwal.selectwdresondwtailfromlist();
	}
	
	
	@When("Admin enters {string}")
	public void admin_enters(String string) throws Exception {
		Withdrwal.enterwdcomments();
	}

	
	@When("Admin Clicks on {string} button")
	public void admin_clicks_on_button(String string) throws Exception {
	    Withdrwal.clickwd();
	    
		
	}






}

package stepDefinitions_LC_ExistingUser;

import java.io.IOException;
import java.sql.SQLException;

import com.opencsv.exceptions.CsvException;
import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataValidation extends SeleniumFunctions{

	DataValidationMethods datavalidation = new DataValidationMethods();
	
	
	 
	@Given("Coach Navigate to Review your coaching circle")
	public void coach_navigate_to_review_your_coaching_circle() {
	    
		datavalidation.coach_navigate_to_review_your_coaching_circle();
		
	}
	@Given("Navigates to View details > students")
	public void navigates_to_view_details_students() throws Exception {
	     
		datavalidation.navigates_to_view_details_students();
	}
	@Given("click on Download roster")
	public void click_on_download_roster() throws Exception {
	
	 datavalidation.click_on_download_roster();
		
		
	}
	
	@Given("then We will read excel data and get all details and assert data")
	public void then_we_will_read_excel_data_and_get_all_details() throws IOException, CsvException, SQLException {
	 
		 datavalidation.then_we_will_read_excel_data_and_get_all_details();
	}
	@Then("we will fetch data from DB and compare with UI values")
	public void we_will_fetch_data_from_db_and_compare_with_ui_values() throws SQLException {
		
		
		datavalidation.we_will_fetch_data_from_db_and_compare_with_ui_values();
		
		
	    
	}



	
	
}

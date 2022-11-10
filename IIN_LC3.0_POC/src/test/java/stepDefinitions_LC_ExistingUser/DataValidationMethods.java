package stepDefinitions_LC_ExistingUser;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.BaseVariables;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.seleniumFuctions.SeleniumFunctions;

public class DataValidationMethods extends SeleniumFunctions {

	public ArrayList<String> alist1 = new ArrayList<String>();
	public ArrayList<String> alist2 = new ArrayList<String>();
	public String email = null;
	public String name = null;
	public String email_val = null;
	public String occupationval = null;
	public String city = null;
	public String country = null;

	public void coach_navigate_to_review_your_coaching_circle() {

		WebDriver driver = BaseVariables.getInstance().getWebdriver();
		List<WebElement> reviewYourCC = driver.findElements(By.xpath("//*[text()='Review your coaching circles']"));
		reviewYourCC.get(1).click();

	}

	public void navigates_to_view_details_students() throws Exception {
		Page("CoachView").clickElement("ViewDetailsClick");
		Page("CoachView").clickElement("Studentclicks");
	}

	public void click_on_download_roster() throws Exception {
		Page("CoachView").clickElement("DownloadRoster");
	}

	public void then_we_will_read_excel_data_and_get_all_details() throws IOException, CsvException, SQLException
	{
		String p1 = System.getProperty("user.dir");
				//also check date
				
         String path = "C:\\Users\\sumit.goyal.IRISSOFTWARE\\Downloads\\student_roster_cc_The Health Coach Training Programᵀᴹ Accelerated_28_9_2022.csv";
		
		Reader reader = new FileReader(path);
	
		CSVReader csvreader = new CSVReader(reader);
		
		List<String[]> data = csvreader.readAll();
		
		for(String[] data_arrayform : data){
			
			email_val=data_arrayform[1];
			
			alist1.clear();
			int i=0;
			
			for(String data_student : data_arrayform ){
				
				alist1.add(data_student);
				 ++i;
				 if(i==5)
				 {
					 we_will_fetch_data_from_db_and_compare_with_ui_values(); 
				 }
				 
				//
				 		}
		}	
	}

	public void we_will_fetch_data_from_db_and_compare_with_ui_values() throws SQLException {
		Connection c = null;
		ResultSet rs = null;
		Statement statement = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection(
					"jdbc:postgresql://learningcenter-qa-instance-1.cwoujmterdps.us-east-1.rds.amazonaws.com/learningcenterdb",
					"learningcenter", "N7^6tr123#2Gj8");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");

		try {
			statement = c.createStatement();
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		try {
			rs = statement.executeQuery(
					"SELECT DISTINCT st.id, st.last_name ,st.first_name,st.updated_by,st.occupation,ad.city,ad.country,ad.id\r\n"
							+ "FROM student st\r\n" + "JOIN address ad\r\n"
							+ "ON st.address_id = ad.id where st.updated_by IN('" + email_val + "');");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// Name email occ city country city

		while (rs.next()) {

			String fname = rs.getString("first_name") + " "+rs.getString("last_name");
			alist2.add(fname);
			// /String lname = ;
			String email = rs.getString("updated_by");
			alist2.add(email);
			String occupation = rs.getString("occupation");
			alist2.add(occupation);
			String cityval = rs.getString("city");
			alist2.add(cityval);
			String countryval = rs.getString("country");
			alist2.add(countryval);

			System.out.print(fname + "  " + email + " " + occupation + " " + country + " " + city);
			 Assert.assertTrue(alist1.equals(alist2));
			 alist2.clear();
			System.out.println("------------------------");
		}

	}

}

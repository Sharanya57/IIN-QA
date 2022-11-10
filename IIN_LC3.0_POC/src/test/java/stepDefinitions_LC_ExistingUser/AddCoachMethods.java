package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

public class AddCoachMethods extends SeleniumFunctions{

	
	public void navigate_to_coach_page() throws Exception
	{
		Page("Addcoach").clickElement("UsersAdmin");
		Page("Addcoach").clickElement("Coaches");
	}
	
	
	public void clickaddnewcoach() throws Exception
	{
		Page("Addcoach").clickElement("AddnewCoach");
	}
	
	public void fill_details(String username_email,String DOB,String newpassword_coach,String fname,String lastname,String gender,String code,String mobphone,String mailingaddress) throws Exception
	{
		Page("Addcoach").sendKeysToElement("username_email",username_email);
		Page("Addcoach").sendKeysToElement("coachdob", DOB);
		 
		
		Page("Addcoach").sendKeysToElement("coach_pass",newpassword_coach);
		Page("Addcoach").sendKeysToElement("username_pass",newpassword_coach);
		Page("Addcoach").sendKeysToElement("coachfname",fname);
		Page("Addcoach").sendKeysToElement("coachlname",lastname);
		Page("Addcoach").sendKeysToElement("coachdob", DOB);
		
		Page("Addcoach").clickElement("GendercoachDropdown");
		Page("Addcoach").DropDownSelect("Addcoach", "GenderSelectValue", gender);
	
		Page("ProfilePage").clickElement("Codeselectcountry");
		Page("ProfilePage").countrycodeselect(code, "Codeselectcountry");
		Page("ProfilePage").clickElement("MobilePhoneFill");
		Page("ProfilePage").sendKeysToElement("MobilePhoneFill", mobphone);
		
		
		
	   Page("Addcoach").clickElement("CoachAddress");
	   Page("Addcoach").TypeInField("CoachAddress", mailingaddress);
	   Page("Addcoach").clickElement("Addresscoachclick");
	   
	   
		
		
		
		
		
		
	}
	
	public void clicksavebutton() throws Exception
	{
		 Page("Addcoach").clickElement("SaveCoach");
	}
	
}

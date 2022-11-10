package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

public class EditCoachMethods extends SeleniumFunctions {

	
	public void adminsearchnewcoach(String coachname) throws Exception
	{
		Page("EditCoachDetails").sendKeysToElement("CoachSearch", coachname);
		Page("EditCoachDetails").clickElement("CoachSearch");
		Page("EditCoachDetails").clickElement("OpenCoach");
		Page("EditCoachDetails").clickElement("EditCoachButton");
		
	}
	
	
	
	public void Fillnewcoachdetails(String fname,String lastname,String DOB,String gender,String mobphone) throws Exception
	{

		Page("EditCoachDetails").doubleClickElement("coachfname_edit");
		Page("EditCoachDetails").sendKeysToElement("coachfname_edit", fname);
		Page("EditCoachDetails").doubleClickElement("coachlname_edit");
		Page("EditCoachDetails").sendKeysToElement("coachlname_edit", lastname);
		Page("EditCoachDetails").BackspacePressUntilTextBoxClear("coachdob_edit");
		Page("EditCoachDetails").sendKeysToElement("coachdob_edit", DOB);
		Page("EditCoachDetails").clickElement("GendercoachDropdown_edit");
		Page("EditCoachDetails").DropDownSelect("EditCoachDetails", "GenderSelectValue_edit", gender);
		Page("EditCoachDetails").tripleClickElement("MobilePhoneFill_edit");
		Page("EditCoachDetails").sendKeysToElement("MobilePhoneFill_edit", mobphone);

		
		 
	 
	}
	
	public void savebuttonafterEditimgDetails() throws Exception
	{
		Page("EditCoachDetails").clickElement("SaveCoach_edit");
	}
	
	
	
	
	
}

package stepDefinitions_LC_ExistingUser;

import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.When;

public class Filtercoach extends SeleniumFunctions {

	@When("Admin Filters Coach based on Profile {string}")
	public void admin_filters_coach_based_on_profile(String name) throws Exception {

 		 
		Page("FilterCoach").clickElement("ClickFilter");
		 Page("FilterCoach").clickElement("ClickFilterProfile");
		Page("FilterCoach").sendKeysToElement("FirstNameProfile", name);
		
		Page("FilterCoach").clickElement("CLickViewResults");
		
		
		String value=Page("FilterCoach").GetElementText("Coachdetailsgettext");
		Assert.assertTrue(value.contains(name)); 
	}

	@When("Admin Filters Coach based on Age {int} and {int}")
	public void admin_filters_coach_based_on_age(int ageleft,int ageright) throws Exception {

		Page("FilterCoach").clickElement("AgeFilter");	
		 
	Page("FilterCoach").SliderHdandle("AgeFilterLeft", "AgeFilterRight",ageleft,ageright,"AgeFilterLeftText","AgeFilterRightText");	
	
		
	Page("FilterCoach").clickElement("CLickViewResults");
		
		
		
	}
	

	@When("Admin Filters Coach based on Gender")
	public void admin_filters_coach_based_on_gender() throws Exception {
		
		Page("FilterCoach").clickElement("Genderfilter");
		Page("FilterCoach").clickElement("GenderfilterMale");
		Page("FilterCoach").clickElement("CLickViewResults");
	
	
	}

	@When("Admin Filters Coach based on Location")
	public void admin_filters_coach_based_on_location() throws Exception {

		Page("FilterCoach").clickElement("Locationfilter");
		Page("FilterCoach").clickElement("LocationfilterPlusicon");
		Page("FilterCoach").clickElement("LocationfilterCountry");
		Page("FilterCoach").sendKeysToElement("LocationfilterCountry", "Eslovenia");
		
		
		
		
		
		Page("FilterCoach").clickElement("CLickViewResults");
		
		
	}

	@When("Admin Filters Coach based on Languages")
	public void admin_filters_coach_based_on_languages() throws Exception {

		
		Page("FilterCoach").clickElement("LanguagesFilter");
		Page("FilterCoach").clickElement("LanguagesFilterEnglish");
		Page("FilterCoach").clickElement("CLickViewResults");
		
		
	}

	@When("Admin Filters Coach based on Cohorts")
	public void admin_filters_coach_based_on_cohorts() throws Exception {

		Page("FilterCoach").clickElement("CohortsFilter");
		Page("FilterCoach").clickElement("CohortsFilterClick");	
		
		
	}

	@When("Admin Filters Coach based on Programs")
	public void admin_filters_coach_based_on_programs() {

		
		
		
		
		
		
	}

	@When("Admin Filters Coach based on Has coaching circle")
	public void admin_filters_coach_based_on_has_coaching_circle() {

	}

}

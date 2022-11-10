package stepDefinitions_LC_ExistingUser;

import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 


public class SpecialitySSO extends SeleniumFunctions{
	String moduleNametext ="";	
	
@When("Student clicks on My course tab")
public void student_clicks_on_my_course_tab() throws Exception {

	
	Page("SpecialitySSO").clickElement("MyCoursetab");
	      
}
@When("studnet clicks on continue learning tab on my course page")
public void studnet_clicks_on_continue_learning_tab_on_my_course_page() throws Exception {

	//Click on continue learning
	Page ("SpecialitySSO").RefreshBrowser();
	
	Page("SpecialitySSO").clickElement("ContinueLearningtab");
	Boolean value=Page("SpecialitySSO").isElementPresent("TakeaTourPopupwindow");
	if(value==true)
	{
    Page("SpecialitySSO").SwitchToFrame(0);
	
	Page("SpecialitySSO").clickElement("TakeaTourPopupwindow");
	Page("SpecialitySSO").SwitchOutsideTheFrame();
	}
}
@When("student should be redirected to modules section")
public void student_should_be_redirected_to_modules_section() throws Exception {

	//check page url should conntain modules
	Page("SpecialitySSO").VerifyPageUrl("/modules");
	
}
@When("student checks the FirstModuleName text")
public void student_checks_the_first_module_name_text()throws Exception {

	//Fetch module name
	moduleNametext = Page("SpecialitySSO").GetElementText("ModuleNametext");
}

@When("student clicks on Satrt button on Learning page")
public void student_clicks_on_satrt_button_on_learning_page()  {

	//click on start button
	Page("SpecialitySSO").clickToElementByJS("StartButtonClickbutton");
	
}
@Then("student will be redirected to the module page which is same.")
public void student_will_be_redirected_to_the_module_page_which_is_same() {

	//shadowDom method
 	String modulename=Page("SpecialitySSO").GetTextElement_ShadowDomModulesPage();
    Assert.assertEquals(moduleNametext, modulename);
}
}


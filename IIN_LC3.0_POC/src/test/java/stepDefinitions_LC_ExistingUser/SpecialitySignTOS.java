package stepDefinitions_LC_ExistingUser;



import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpecialitySignTOS extends SeleniumFunctions{
	String Email;

@When("student clicks on {string} Button")
public void student_clicks_on_button(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("signatureButton");
   
}

@When("student clicks on {string} checkbox Button")
public void student_clicks_on_checkbox_button(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("iAgreebutton");
   
}
@When("student clicks on {string} Button on blue banner")
public void student_clicks_on_button_on_blue_banner(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("continueButton");
}

@When("student clicks on {string} Button of the TOS")
public void student_clicks_on_button_of_the_tos(String string)  throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("startButton");
}
@When("student clicks on {string} Button on TOS document")
public void student_clicks_on_button_on_tos_document(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("signInboxButton");
}
@When("student clicks on {string} Button on the pop up window")
public void student_clicks_on_button_on_the_pop_up_window(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("adoptAndsignButton");
}
@When("student clicks on {string} Button on top right corner")
public void student_clicks_on_button_on_top_right_corner(String string) throws Exception
{
	
	Page("ReadandSignAgreement").clickElement("finishTabbutton");
}
@When("student clicks on {string} Button on read and sign agreement page")
public void student_clicks_on_button_on_read_and_sign_agreement_page(String string) throws Exception
{
	 Thread.sleep(7000);
//	System.out.println(Page("ReadandSignAgreement").checkElementEnabled("nextButton"));

	Page("ReadandSignAgreement").NextButtonClick();
}
@Then("student redirected to {string} Page")
public void student_redirected_to_page(String pagename) throws Exception {
	String text= Page("PaymentMethods").GetElementText("paymentDetails");
	Assert.assertEquals(text, pagename);	
}
}

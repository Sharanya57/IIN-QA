package stepDefinitions_LC_ExistingUser;



import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpecialityPaymnetMethod extends SeleniumFunctions{
	String Email;
	
@When("student enters the {string} on payment page")
public void student_enters_the_on_payment_page(String Nameonthecard) throws Exception
{
	
	Page("PaymentMethods").clickElement("NameonCardtab");
	Page("PaymentMethods").sendKeysToElement("NameonCardtab", Nameonthecard);

}
@When("student clicks on {string} checkbox on payment page")
public void student_clicks_on_checkbox_on_payment_page(String string) throws Exception {
	
	Page("PaymentMethods").clickElement("SameAsMailingCheckbox");
	
}
@When("student enters the {string},{string},{string}")
public void student_enters_the(String Cardnumber, String Expirationdate, String CVCfield) throws Exception {
	
	//Fill card number
			Page("PaymentMethods").SwitchToFrame("iframeCardNumbertab");
			Page("PaymentMethods").clickElement("cardnumbertab");
			Page("PaymentMethods").sendKeysToElement("cardnumbertab", Cardnumber);

			//switching outside frame
			Page("PaymentMethods").SwitchOutsideTheFrame();
		
	        //switch inside frame
			Page("PaymentMethods").SwitchToFrame("iframeDatetab");
			//Fill expiration date
			String[]val = Expirationdate.split("/20");
			Expirationdate=val[0]+val[1];
			Page("PaymentMethods").clickElement("ExpirationDatetab");
			Page("PaymentMethods").sendKeysToElement("ExpirationDatetab", Expirationdate);
	        //Comeoutside frame
			Page("PaymentMethods").switchToDefaultFrame();
			Page("PaymentMethods").SwitchToFrame("iframeCVCtab");
			//Fill CVC detail
			Page("PaymentMethods").clickElement("CVCtab");
			Page("PaymentMethods").sendKeysToElement("CVCtab", CVCfield);
			//come outside frame
			Page("PaymentMethods").switchToDefaultFrame();

			
}
@When("Student clicks on {string} on payment page")
public void student_clicks_on_on_payment_page(String string)throws Exception {
	
	Page("PaymentMethods").clickElement("FinishEnrollingButton");
	
}

@Then("student will redirect to {string} Page")
public void student_will_redirect_to_page(String  pagename) throws Exception {
	String text= Page("PaymentMethods").GetElementText("CongratulationPage");
	Assert.assertEquals(text, pagename);	
}
}



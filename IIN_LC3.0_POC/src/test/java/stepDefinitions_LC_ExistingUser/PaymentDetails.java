package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentDetails extends SeleniumFunctions {

	

	@When("Student Enters {string},{string},{string},{string}")
	public void student_enters(String NameOnTheCard, String CardNumber, String ExpirationDate, String CVC) throws Exception {

		//Fill the name
		Page("PaymentInformation").clickElement("NameOnTheCard");
		Page("PaymentInformation").sendKeysToElement("NameOnTheCard", NameOnTheCard);

		//Fill card number
		Page("PaymentInformation").SwitchToFrame("iframeCardNumber");
		Page("PaymentInformation").clickElement("CardNumber");
		Page("PaymentInformation").sendKeysToElement("CardNumber", CardNumber);

		//switching outside frame
		Page("PaymentInformation").SwitchOutsideTheFrame();
		//Entering billing address
//		/Page("PaymentInformation").clickElement("CardBillingAddressClick");
		//click checkbox to get the billing address field
		
		//Page("PaymentInformation").clickElement("BAddressbox");
		//Page("PaymentInformation").clickElement("CardBillingAddressClick");
		
		//Page("PaymentInformation").TypeInField("CardBillingAddressInput", address);
		//Page("PaymentInformation").DownKeyPress();
		//Page("PaymentInformation").EnterPress();
        //switch inside frame
		Page("PaymentInformation").SwitchToFrame("iframeDate");
		//Fill expiration date
		String[]val = ExpirationDate.split("/20");
		ExpirationDate=val[0]+val[1];
		Page("PaymentInformation").clickElement("ExpirationDate");
		Page("PaymentInformation").sendKeysToElement("ExpirationDate", ExpirationDate);
        //Comeoutside frame
		Page("PaymentInformation").switchToDefaultFrame();
		Page("PaymentInformation").SwitchToFrame("iframeCVC");
		//Fill CVC detail
		Page("PaymentInformation").clickElement("CVC");
		Page("PaymentInformation").sendKeysToElement("CVC", CVC);
		//come outside frame
		Page("PaymentInformation").switchToDefaultFrame();

		 
	}
	@When("click on the Complete Button")
	public void click_on_the_Complete_button() throws Exception {
		Page("PaymentInformation").clickElement("CompleteButtonPayment");  
		Thread.sleep(5000);
	}
	@Then("Student navigate to the Congratulations page.")
	public void student_navigate_to_the_congratulations_page() {
	    
	}



}

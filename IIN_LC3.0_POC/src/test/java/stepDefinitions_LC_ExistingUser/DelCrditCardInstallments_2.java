package stepDefinitions_LC_ExistingUser;

import org.testng.Assert;

import com.seleniumFuctions.SeleniumFunctions;

public class DelCrditCardInstallments_2 extends SeleniumFunctions{
	
	
public void removeCC() throws Exception {
	Page ("PaymentMethod").clickElement("removecc");
}

//public void validationtext(String pagename) throws Exception {
//String text= Page("PaymentMethod").GetElementText("popuptext");
//Assert.assertEquals(text, pagename);	
	    

public void clickGotit() throws Exception {
	Page ("PaymentMethod").clickElement("ClickGotIT");
}


}






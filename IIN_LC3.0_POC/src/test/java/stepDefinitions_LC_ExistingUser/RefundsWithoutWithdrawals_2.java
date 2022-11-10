package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

public class RefundsWithoutWithdrawals_2 extends SeleniumFunctions
{
	
	public void clickrefund() throws Exception {
	Page ("CreateRefunds").clickElement("ClickRefund");

	}
	public void enteramount() throws Exception {
		Page ("CreateRefunds").clickElement("ClickAmount");
		Page ("CreateRefunds").sendKeysToElement("EnterAmount", "10000");
		
	}

	public void entercomment() throws Exception {
		Page ("CreateRefunds").clickElement("ClickComments");
		Page ("CreateRefunds").sendKeysToElement("EnterComments", "Testing");
		
	
}
	public void clickcreate() throws Exception {
		Page ("CreateRefunds").clickElement("ClickCreate");
	}
	
	public void enterrefundamount() throws Exception {
		Page ("CreateRefunds").clickElement("ClickAmount");
		Page ("CreateRefunds").sendKeysToElement("EnterRefundAmount", "10000");
		
	
}
	public void clicksubmitrefunds() throws Exception {
		Page ("CreateRefunds").clickElement("ClickSubmitButton");
		Page ("CreateRefunds").clickElement("ClickIamsure");
	}
}

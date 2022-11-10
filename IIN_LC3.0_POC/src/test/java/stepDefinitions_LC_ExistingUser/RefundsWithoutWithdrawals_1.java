package stepDefinitions_LC_ExistingUser;

import io.cucumber.java.en.When;

public class RefundsWithoutWithdrawals_1
{
	RefundsWithoutWithdrawals_2 Refunds=new RefundsWithoutWithdrawals_2();


@When("Admin Clicks on {string}")
public void admin_clicks_on1(String string) throws Exception {
	Refunds.clickrefund();
    
}

@When("Admin enters {string} and {string} to create refund screen")
public void admin_enters_and_to_create_refund_screen(String string, String string2) throws Exception {
    Refunds.enteramount();
    Refunds.entercomment();
}

@When("Admin clicks on {string}")
public void admin_clicks_on(String string) throws Exception {
	Refunds.clickcreate();  
	
}

@When("Admin lands on Refund screen and open student and enters {string}")
public void admin_lands_on_refund_screen_and_open_student_and_enters(String string) throws Exception {
	Refunds.enterrefundamount();
}
    
@When("Admin click on {string}")
public void admin_click_on(String string) throws Exception {
  Refunds.clicksubmitrefunds();
}

}

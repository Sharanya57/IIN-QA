package stepDefinitions_LC_ExistingUser;

import com.seleniumFuctions.SeleniumFunctions;

public class StudentWithdrwal_2 extends SeleniumFunctions{
	


public void clickusertab() throws Exception {
Page ("AdminPortalWithdrawal").clickElement("WDUsers");

}

public void clickstudenttab() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDStudenticon");
}


public void clicksearchbar() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("searchbar");
}

public void enteruserid(String userid) throws Exception {

Page ("AdminPortalWithdrawal").sendKeysToElement("searchbar", userid);
}

public void clickavatar() throws Exception {
   Page ("AdminPortalWithdrawal").clickElement("avatar");
}

public void clickpaymentinfobutton() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDpayinfo");
}


public void clickpaymentplanTermButton() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDplan");
}

public void clickwdstudent() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDstudenttab");
}

public void clickwithdrwalreason() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDReasontab");
}
	
public void selectwdresonlfromlist() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDReasonlistselect");
	
	
}
public void clickwdreasondetailtab() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDReasondetailtab");
	
}
public void selectwdresondwtailfromlist() throws Exception {
	Page ("AdminPortalWithdrawal").clickElement("WDReasondetaillist");
}

public void enterwdcomments() throws Exception {
	Page ("AdminPortalWithdrawal").tripleClickElement("WDComments");
	Page ("AdminPortalWithdrawal").sendKeysToElement("enterWDcomments", "Testing");
}

public void clickwd() throws Exception {
	Page("AdminPortalWithdrawal").clickElement("WD");
	
}
}




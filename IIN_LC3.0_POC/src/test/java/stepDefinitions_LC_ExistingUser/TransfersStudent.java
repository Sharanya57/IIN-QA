package stepDefinitions_LC_ExistingUser;

//import com.core.TestProperties;
import com.seleniumFuctions.SeleniumFunctions;

//import io.cucumber.java.en.When;

public class TransfersStudent extends SeleniumFunctions {
	
	

	public  void clickUser() throws Exception {


        Page("AdminPortalTransfer").clickElement("TransferUsers");


    }
	
	public  void clickAdminStudent() throws Exception {


        Page("AdminPortalTransfer").clickElement("AdminStudent");


    }
	
	
	
public void searchStudent() throws Exception {
	
	Page("AdminPortalTransfer").clickElement("Studentsearch");
	
}

public void enterStudent(String username1) throws Exception {
	
	Page("AdminPortalTransfer").sendKeysToElement("Studentsearch", username1);
	
}

public void clickfaceicon() throws Exception {
	try {
		
	
Boolean value=isElementPresent("faceicon");
	if(value==true) {
		
		Page("AdminPortalTransfer").clickElement("faceicon");
	}
	else {}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

public void clickStudentURL() throws Exception {
	
	Page("AdminPortalTransfer").clickElement("Adminpayinfo");
	
}
//public void clickusername() throws Exception {
//
//Page("AdminPortalTransfer").clickElement("clickemail");
//
//}
public void clickpaymenttab() throws Exception {
	
		Page("AdminPortalTransfer").clickElement("Adminpayinfo");
		
}

public void clickcross() throws Exception {
	
	Page("AdminPortalTransfer").clickElement("Closebutton");
	
}

public void clickplantab() throws Exception {
	
	Page("AdminPortalTransfer").clickElement("Adminplan");
	
}

public void clicktransfertab() throws Exception {
	Page("AdminPortalTransfer").clickElement("Transferstutab");
	
	
}

public void clickcohortlistfromdropdown() throws Exception {
    
Page("AdminPortalTransfer").clickElement("Transfertodropdown");

}

public void selectcohortlistfromdropdown() throws Exception {
    
Page("AdminPortalTransfer").clickElement("Transfertoselect");

}

public void clickpaymentplanlistfromdropdown() throws Exception {
    
Page("AdminPortalTransfer").clickElement("tselectpaymentplan");

}

public void selectpaymentplanlistfromdropdown() throws Exception {
    
Page("AdminPortalTransfer").clickElement("tselectpaymentplandropdown");

}

public void entercommentfortransfer() throws Exception {
    
Page("AdminPortalTransfer").sendKeysToElement("Transfercomment", "test");

}



public void TransferButton() throws Exception {
    
Page("AdminPortalTransfer").clickElement("Transferbutton");

}




//public void loginstudentportal() {
//	
//try {
//	// Hi the website url on chrome
//	NavigateToURL(TestProperties.getInstance().getAdminUrl());
//	LoadApplication();
//} catch (Exception e) {
//
//}
//}
}
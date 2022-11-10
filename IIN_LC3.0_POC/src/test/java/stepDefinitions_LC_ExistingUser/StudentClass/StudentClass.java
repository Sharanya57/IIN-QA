package stepDefinitions_LC_ExistingUser.StudentClass;

import java.util.ArrayList;

import org.openqa.selenium.Alert;

import com.seleniumFuctions.SeleniumFunctions;

public class StudentClass extends SeleniumFunctions {
	
	
	public  void clickMyCourse(String string) throws Exception {
		
		Boolean exists=isElementPresent(string);
	    if(exists==true) {
				Page("StudentCoachingCircle").clickElement("Letsgetstarted");}
		else {
			
			    Page("StudentCoachingCircle").clickElement("DiveBackIn");
		     }
					
	      }
    public  void clickCoachingCircleTab(String string) throws Exception {
    	
		Page("StudentCoachingCircle").clickElement("CoachingCircle");
				
	}
    
 public  void selectCoachingCircleradiobutton(String string) throws Exception {	
	 
		Page("StudentCoachingCircle").clickElement("SelectCoachingCircle");
			}
 
 
 public  void selectCoach(String VerifyCoachName,String coachName) throws Exception {
		
			Page("StudentCoachingCircle").getElementDynamically(VerifyCoachName,coachName).click();
									
				}
			
 public  void selectCoachSubmit(String string) throws Exception {
		//Page("StudentCoachingCircle").clickElement("CoachingCircleSubmit");
		switchToNewWindow();
		
		Page("StudentCoachingCircle").clickElement("CoachingCircleconfirm");

 }

 public void clickhere() throws Exception {
	 Page("StudentCoachingCircle").clickElement("ChangeCC");
	 
 }

 public  void selectCoach2(String VerifyCoachName,String coachName2) throws Exception {
		
		Page("StudentCoachingCircle").getElementDynamically(VerifyCoachName,coachName2).click();
								
			}
 
 public void clickconfirm() throws Exception {
	 Page("StudentCoachingCircle").clickElement("clickconfirm");
 }
 
 public void clickURL() throws Exception {
	 Page("StudentCoachingCircle").clickElement("WebURLLink");
 }
 
}




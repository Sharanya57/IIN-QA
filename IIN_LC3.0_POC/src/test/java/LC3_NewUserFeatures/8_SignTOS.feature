@SignTOSAgreement
Feature: Student signs the agreement	


  Scenario: As Student I need to Sign the agreement of Terms Of services.
 
Given Student is on Existing Student Portal
When Student Enters the Username and password
And Student Clicks on Continue Button 
And Student clicks on the Sign button 
And Student  navigates to the Agreement page 
And Student Sign the Agreement 
When Student Signed the agreement 
And clicks on the finish button and click on the Complete Button
Then Student should be able to navigate to the My Course page.



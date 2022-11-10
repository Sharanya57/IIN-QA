
@AdminLogin1
Feature: Admin Login functionality


Scenario Outline: As an admin I need to Login to application
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
And Admin Navigates to "Applications Dashboard" Page 
And Admin clicks on Menu Icon 
And Admin clicks on the "Users" tab
And clicks on "AdminStudent" tab
And click on the Studentsearch button
And enter "<username1>" in search button
And click on the faceicon
And click on cross icon in the pop up window
And click on the face icon again
And click on the "PaymentInfo" tab
And clicks on the "AdminPlanterms1" tab
And Admin clicks on Transferstudent tab
And Admin selects cohort from "<TransferTo>" dropdown
And Admin click on the Selectpaymentplan tab
And Admin select "<paymentplantransfer>"
And Admin enter "<transfercomments>"
And clicks on the Transfer button
And existing Student is on Student Portal 







Examples: 
 |							Username                  |password  |  username1  | TransferTo | paymentplantransfer |transfercomments|
 | QAteam@integrativenutrition.com | Password123 | jaharri.kaladin@fillnoo.com | The Health Coach Training Program |39 months at $199 Tuition price: 7672|test|
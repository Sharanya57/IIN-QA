@AdminLogin2
Feature: Admin Login functionality


Scenario Outline: As an admin I need to Login to application
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
And Admin Navigates to "Applications Dashboard" Page 
And Admin clicks on Menu Icon 
And Admin Clicks on user tab
And Admin Clicks on student face icon
And Admin clicks on Search bar
And Admin enters "<userid>" of student
And Admin Clicks on avatar
And Admin Clicks on "Payment information" tab
And Admin clicks on "Payment plan terms" tab
And Admin clicks on  "Withdraw Student" tab
And Admin select "<Withdrwal Reason>" from dropdown
And Admin Selct "<Withdrwal Reason Detail>" from dropdown
And Admin enters "<Withdrwal Comment>"
And Admin Clicks on "Withdraw" button
#Check withdrwals




Examples: 
 |							Username                  |password  |userid|            Withdrwal Reason|Withdrwal Reason Detail|Withdrwal Comment|
 | QAteam@integrativenutrition.com | Password123 |coleden.kilean@fillnoo.com|FIN - Collections|No Past Due Outreach|Testing|
 
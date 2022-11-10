@EditCoach
Feature: Edit coach details in admin portal


 Scenario Outline: As an admin I need to edit coach details
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
And Admin clicks on Menu Icon 
And Admin Navigates to users>coaches
And Admin searches new "<coach_name>"
And Admin changes "<usernameemail>","<newpassword_coach>","<conformpassword>","<fname>","<lastname>","<DOB>","<Gender>","<MobilePhone>","<Mailing Address>","<code>"
And Admin clicks on save button and close window




Examples: 
 |							Username                  |password  |  usernameemail | newpassword_coach | conformpassword | fname|lastname|DOB|coach_name|Gender|MobilePhone|Mailing Address|code| 
 | QAteam@integrativenutrition.com | Password123 | testuser9@gmail.com |Subh@1987#! |Subh@1987#!   | sneha  |singh |11111995 | testuser9 | Female | 7974012887 |111| +91|







@Addnewcoach_
Feature: Add new coach in admin portal


 Scenario Outline: As an admin I need to create new coach
 
Given Admin is on Admin Portal
When Admin Enters the "<Username>" and "<password>"
And Admin Clicks on "Continue" Button
#Then Admin Navigates to "Dashboard" Page  
And Admin clicks on Menu Icon 
And Admin Navigates to users>coaches
And Admin clicks on add new coach
And Admin fills "<usernameemail>","<newpassword_coach>","<conformpassword>","<fname>","<lastname>","<DOB>","<Gender>","<MobilePhone>","<Mailing Address>","<code>"
And Admin clicks on save button
And  All information will be saved on admin portal



Examples: 
 |							Username                  |password  |  usernameemail | newpassword_coach | conformpassword | fname|lastname|DOB|Gender|MobilePhone|Mailing Address|code| 
 | QAteam@integrativenutrition.com | Password123 | testuser9@gmail.com |Subh@1987#! |Subh@1987#!           | sumit  |goyal |11111990 | Male | 8319690987 |111| +91|







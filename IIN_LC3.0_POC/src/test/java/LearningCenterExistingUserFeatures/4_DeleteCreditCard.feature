@CreditCardsDelete
Feature: Delete credit cards to the student profile


  Scenario Outline: As a student I need to delete credit card to my profile
 
Given Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "Continue" Button
#Then Student Navigates to Course Enrollment Page  
And Student clicks on My Payment
And Student clicks on Wallet
And User Changes the Primary method of Payment
Then User removes the Credit card 
And Card data "<NameOnTheCard>" should not be present on page
And User should be Able to Logout

Examples: 
 |Username             |password    |NameOnTheCard  |CardNumber          |ExpirationDate|CVC|
 |akilan.riyad@fillnoo.com|Test@123 |Nikita         |4242 4242 4242 4242 |1223         |123|  



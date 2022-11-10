@CreditCardsAdd
Feature: Add credit cards to the student profile


 Scenario Outline: As a student I need to add credit card to my profile
 
Given existing Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "ContinueButton"
#And click on the back arrow button
#Then Student Navigates to Course Enrollment Page  
And Student clicks on My Payment
And Student clicks on Wallet
And Student clicks on Add a Payment method Button
And Student clicks on Add a credit or debit card 
And Student enters "<Address>","<NameOnTheCard>","<CardNumber>", "<ExpirationDate>","<CVC>"
And student clicks on Add payment method Button
Then the new credit card details "<NameOnTheCard>","<ExpirationDate>","<Address>" will be saved and displayed on the screen
And User should be Able to Logout

    Examples: 
 |Username                    |password   |NameOnTheCard  |CardNumber          |ExpirationDate|CVC|Address																			|
 |akilan.riyad@fillnoo.com|Test@123 |Nikita Goel       |4242424242424242 |10/2029          |123|  Arcos 2319, Buenos Aires, Argentina   |
																																													               
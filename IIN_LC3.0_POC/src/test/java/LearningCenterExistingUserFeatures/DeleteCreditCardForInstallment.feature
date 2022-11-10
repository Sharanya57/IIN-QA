@DelCrditCardInstallments
Feature: Delete credit cards to the student profile who opted for installment plan


  Scenario Outline: As a student who opted for insatllment plan need to delete credit card form the profile
 
Given existing Student is on Student Portal
When Student Enters the "<Username>" and "<password>"
And Student Clicks on "Continue" Button 
And Student clicks on My Payment
And Student clicks on Wallet
Then student removes the Credit card 
#And User click on "Yes, I am sure" on pop up box
#Then Cards do not get removed and student clicks on Payment Information
#And Student checks "You cannot remove your payment method as you have an active payment plan" on pop up box
And Student click "Got it" button
And User should be Able to Logout

Examples: 
 |Username             |password    |
 |kamaal.kiowa@fillnoo.com|Qwertyui1 |
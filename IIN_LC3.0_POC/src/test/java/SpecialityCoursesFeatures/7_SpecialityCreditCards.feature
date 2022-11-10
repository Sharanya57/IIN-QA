@SpecialityCreditCardsAdd
Feature: Add credit cards to the student profile


  Scenario Outline: As a student I need to add credit card to my profile
  
When Student clicks on Payment Information
And Student clicks on Wallet
And Student clicks on Add a Payment method Button
And Student clicks on Add a credit or debit card 
And Student enters "<Address>","<NameOnTheCard>","<CardNumber>", "<ExpirationDate>","<CVC>"
And student clicks on Add payment method Button
Then the new credit card details "<NameOnTheCard>","<ExpirationDate>","<Address>" will be saved and displayed on the screen


    Examples: 
 |NameOnTheCard  |CardNumber          |ExpirationDate|CVC|Address																			|
 |Nikita Goel       |4242 4242 4242 4242 |10/2029          |123|  Arcos 2319, Buenos Aires, Argentina   |
																																													               
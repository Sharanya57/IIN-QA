@IINPaymentDetails
Feature: Enter payment details for Student
 
 
 
  Scenario Outline: Student needs to enter card details.
    
    When Student Enters "<NameontheCard>","<CardNumber>","<ExpirationDate>","<CVC>"
    And click on the Complete Button
    #Then Student navigate to the Congratulations page.

    Examples: 
      | NameontheCard | CardNumber | ExpirationDate  | CVC |
      | Sneha |  4242424242424242  | 12/2024 |123|
   

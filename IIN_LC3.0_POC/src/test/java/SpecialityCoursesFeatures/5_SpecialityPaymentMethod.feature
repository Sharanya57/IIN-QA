@SpecialityPaymentMethod
Feature: Student able to Enter Payment details and complete enrollment
         	

Scenario Outline: As a Student I need to enter Payment details and complete enrollment


When student enters the "<Nameonthecard>" on payment page
And student clicks on "Same as Mailing Address" checkbox on payment page
And student enters the "<Cardnumber>","<Expirationdate>","<CVCfield>" 
And Student clicks on "Finish Enrolling" on payment page
Then student will redirect to "Congratulations and Welcome to Detox Your Life" Page

Examples: 
|Nameonthecard |Cardnumber         |Expirationdate|CVCfield|
|Nikita        |4242 4242 4242 4242|10/2029       |123|

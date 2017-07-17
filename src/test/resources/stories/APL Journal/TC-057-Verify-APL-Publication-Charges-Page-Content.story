
Scenario: TC-057-APL-Verify Publication Charges Page Content.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_PublicationCharges
And The ForAuthor-PublicationCharges-Header should display
And I click on ForAuthor-Publication-Charge-Link


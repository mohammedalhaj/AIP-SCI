
Scenario: TC-056-APL-Verify Clicking On Publication Charges Option.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_PublicationCharges
And The ForAuthor-PublicationCharges-Header should display



Scenario: TC-057-JAP-Verify Publication Charges Page Content.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_PublicationCharges
And The ForAuthor-PublicationCharges-Header should display
And I click on ForAuthor-Publication-Charge-Link

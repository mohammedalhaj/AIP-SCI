
Scenario: TC-056-JAP-Verify Clicking On Publication Charges Option.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_PublicationCharges
And The ForAuthor-PublicationCharges-Header should display

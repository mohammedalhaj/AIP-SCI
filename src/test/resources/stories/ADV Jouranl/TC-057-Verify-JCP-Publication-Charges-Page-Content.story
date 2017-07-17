
Scenario: TC-057-JCP-Verify Publication Charges Page Content.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_PublicationCharges
And The ForAuthor-PublicationCharges-Header should display
And I click on ForAuthor-Publication-Charge-Link


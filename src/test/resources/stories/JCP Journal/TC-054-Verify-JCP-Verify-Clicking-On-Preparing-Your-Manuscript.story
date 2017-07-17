
Scenario: TC-054-JCP-Verify Clicking On Preparing Your Manuscript.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I hover over Journal_ForAuthors
Then I click on  Journal_ForAuthors_PreparingYourManuscript
And The ForAuthor-ManuScript-Header should display
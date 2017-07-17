
Scenario: TC-054-JAP-Verify Clicking On Preparing Your Manuscript.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I hover over Journal_ForAuthors
Then I click on  Journal_ForAuthors_PreparingYourManuscript
And The ForAuthor-ManuScript-Header should display

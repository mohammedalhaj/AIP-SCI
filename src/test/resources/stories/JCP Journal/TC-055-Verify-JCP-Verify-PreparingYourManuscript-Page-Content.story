
Scenario: TC-055-JCP-Verify Preparing Your Manuscript Page Content.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I hover over Journal_ForAuthors
Then I click on  Journal_ForAuthors_PreparingYourManuscript
And The ForAuthor-ManuScript-Header should display
And I click on ManuScript-AuthorInstructions
And I click on AppliedPhysicsLettersSpecific


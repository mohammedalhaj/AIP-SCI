
Scenario: TC-055-APL-Verify Preparing Your Manuscript Page Content.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I hover over Journal_ForAuthors
Then I click on  Journal_ForAuthors_PreparingYourManuscript
And The ForAuthor-ManuScript-Header should display
And I click on ManuScript-AuthorInstructions
And I click on AppliedPhysicsLettersSpecific


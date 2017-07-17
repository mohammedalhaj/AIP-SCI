
Scenario: TC-054-APL-Verify Clicking On Preparing Your Manuscript.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I hover over Journal_ForAuthors
Then I click on  Journal_ForAuthors_PreparingYourManuscript
And The ForAuthor-ManuScript-Header should display
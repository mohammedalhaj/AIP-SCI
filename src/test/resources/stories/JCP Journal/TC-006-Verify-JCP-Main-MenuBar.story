
Scenario: TC-006-JCP-Verify Main Menu Bar.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The Home should display
And The browse should display
And The Info should display
And The Journal_ForAuthors should display
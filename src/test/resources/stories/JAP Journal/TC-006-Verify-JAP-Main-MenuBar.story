
Scenario: TC-006-JAP-Verify The Main Menu Bar.
  
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The Home should display
And The browse should display
And The Info should display
And The Journal_ForAuthors should display
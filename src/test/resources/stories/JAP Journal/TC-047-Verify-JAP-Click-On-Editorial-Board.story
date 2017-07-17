
Scenario: TC-047-JAP-Verify Click On Editorial Board.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoEditorialBoard
And The EditorialBoardHeader should display
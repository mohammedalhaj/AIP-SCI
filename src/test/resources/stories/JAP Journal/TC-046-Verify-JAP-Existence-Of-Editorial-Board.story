
Scenario: TC-046-JAP-Verify Existence Of Editorial Board.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And The InfoEditorialBoard should display

Scenario: TC-050-JAP-Verify Existence Of News Option.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over INFO
And The InfoNews should display

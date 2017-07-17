
Scenario: TC-042-JAP-Verify Info Tab.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And The InfoOverview should display
And The InfoEditorialBoard should display
And The InfoNews should display

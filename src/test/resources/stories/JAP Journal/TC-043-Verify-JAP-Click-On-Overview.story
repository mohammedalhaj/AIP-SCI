
Scenario: TC-043-JAP-Verify Click-On-Overview.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoOverview

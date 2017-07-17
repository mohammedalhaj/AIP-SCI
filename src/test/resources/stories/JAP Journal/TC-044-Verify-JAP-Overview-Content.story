
Scenario: TC-044-JAP-Verify Overview Content.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoOverview
And The OverviewHeader should display
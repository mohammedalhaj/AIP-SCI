
Scenario: TC-051-JAP-Verify Clicking On News Tab.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over INFO
And The InfoNews should display

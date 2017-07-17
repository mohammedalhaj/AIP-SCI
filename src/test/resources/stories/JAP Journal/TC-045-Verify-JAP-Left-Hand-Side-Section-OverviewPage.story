
Scenario: TC-045-JAP-Verify Left Hand Side Section Overview Page.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoOverview
And The OverviewHeader should display
And The FocusAndCoverage should be Focus and Coverage
And The EditorialPolicies should be Editorial Policies
And The ContactOverview should be Contact
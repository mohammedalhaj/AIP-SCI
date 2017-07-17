
Scenario: TC-045-JCP-Verify Left Hand Side Section Overview Page.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoOverview
And The OverviewHeader should display
And The FocusAndCoverage should be Focus and Coverage
And The EditorialPolicies should be Editorial Policies
And The ContactOverview should be Contact
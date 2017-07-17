
Scenario: TC-044-JCP-Verify Overview Content.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoOverview
And The OverviewHeader should display

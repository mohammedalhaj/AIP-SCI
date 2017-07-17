
Scenario: TC-044-APL-Verify Overview Content.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then The INFO should display
And I hover over INFO
And I click on InfoOverview
And The OverviewHeader should display

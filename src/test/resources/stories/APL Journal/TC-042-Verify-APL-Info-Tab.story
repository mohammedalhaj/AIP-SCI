
Scenario: TC-042-APL-Verify Info Tab.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then The INFO should display
And I hover over INFO
And The InfoOverview should display
And The InfoEditorialBoard should display
And The InfoNews should display
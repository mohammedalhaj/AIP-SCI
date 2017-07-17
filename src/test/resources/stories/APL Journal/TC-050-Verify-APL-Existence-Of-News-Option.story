
Scenario: TC-050-APL-Verify Existence Of News Option.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over INFO
And The InfoNews should display

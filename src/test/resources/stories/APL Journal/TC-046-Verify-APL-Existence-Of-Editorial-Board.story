
Scenario: TC-046-APL-Verify Existence Of Editorial Board.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then The INFO should display
And I hover over INFO
And The InfoEditorialBoard should display
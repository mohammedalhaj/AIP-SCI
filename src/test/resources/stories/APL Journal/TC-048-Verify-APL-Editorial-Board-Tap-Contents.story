
Scenario: TC-048-APL-Verify Editorial Board Tap Contents.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over INFO
And I click on InfoEditorialBoard
And The EditorialBoardHeader should be Editorial Board

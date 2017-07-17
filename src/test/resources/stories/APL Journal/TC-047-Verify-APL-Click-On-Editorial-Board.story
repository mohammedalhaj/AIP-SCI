
Scenario: TC-047-APL-Verify Click On Editorial Board.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then The INFO should display
And I hover over INFO
And I click on InfoEditorialBoard
And The EditorialBoardHeader should display

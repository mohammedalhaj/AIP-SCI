
Scenario: TC-049-APL-Verify Left Hand Section Editorial Board.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over INFO
And I click on InfoEditorialBoard
And The Editors should display
And The EditorialAdvisoryBoard should display

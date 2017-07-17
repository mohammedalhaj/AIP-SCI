
Scenario: TC-049-JCP-Verify Left Hand Section Editorial Board.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over INFO
And I click on InfoEditorialBoard
And The Editors should display
And The EditorialAdvisoryBoard should display

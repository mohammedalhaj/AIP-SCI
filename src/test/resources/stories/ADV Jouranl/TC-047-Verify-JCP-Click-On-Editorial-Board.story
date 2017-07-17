
Scenario: TC-047-JCP-Verify Click On Editorial Board.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The INFO should display
And I hover over INFO
And I click on InfoEditorialBoard
And The EditorialBoardHeader should display

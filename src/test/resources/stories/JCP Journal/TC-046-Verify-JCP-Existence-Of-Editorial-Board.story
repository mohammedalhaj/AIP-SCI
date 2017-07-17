
Scenario: TC-046-JCP-Verify Existence Of Editorial Board.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The INFO should display
And I hover over INFO
And The InfoEditorialBoard should display
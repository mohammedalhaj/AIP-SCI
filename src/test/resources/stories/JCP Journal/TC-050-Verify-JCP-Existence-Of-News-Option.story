
Scenario: TC-050-JCP-Verify Existence Of News Option.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over INFO
And The InfoNews should display


Scenario: TC-042-JCP-Verify Info Tab.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then The INFO should display
And I hover over INFO
And The InfoOverview should display
And The InfoEditorialBoard should display
And The InfoNews should display
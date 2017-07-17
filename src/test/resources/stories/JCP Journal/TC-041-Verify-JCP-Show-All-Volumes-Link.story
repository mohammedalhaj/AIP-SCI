
Scenario: TC-041-JCP-Verify Show All Volumes Link.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The TOCShowAllVolumes should display
And I click on TOCShowAllVolumes
And The All_Volumes should display
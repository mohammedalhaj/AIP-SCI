
Scenario: TC-024-JCP-Verify Display Section.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The TOCDisplayLabel should display
And The TOCDisplay20 should display
And The TOCDisplay50 should display
And The TOCDisplay100 should display
And The TOCDisplayAll should display
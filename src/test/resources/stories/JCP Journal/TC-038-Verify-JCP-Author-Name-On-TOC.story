
Scenario: TC-038-JCP-Verify Author Name On TOC.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The TOCAuthors should display
And I click on TOCAuthors

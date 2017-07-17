
Scenario: TC-026-JCP-Verify Next And Previous.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The PreviousIssue should display
And I click on PreviousIssue
And The NextIssue should display

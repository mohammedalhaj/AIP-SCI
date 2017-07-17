
Scenario: TC-032-JCP-Verify Export Citation.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then I click on ExportCitation
And I switch tabs
And The DownloadArticleCitation should display


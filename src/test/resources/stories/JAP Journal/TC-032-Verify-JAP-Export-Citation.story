
Scenario: TC-032-JAP-Verify Export Citation.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then I click on ExportCitation
And I switch tabs
And The DownloadArticleCitation should display

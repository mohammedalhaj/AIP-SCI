
Scenario: TC-032-APL-Verify Export Citation.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then I click on ExportCitation
And I switch tabs
And The DownloadArticleCitation should display


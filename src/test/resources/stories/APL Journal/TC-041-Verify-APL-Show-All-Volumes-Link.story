
Scenario: TC-041-APL-Verify Show All Volumes Link.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The TOCShowAllVolumes should display
And I click on TOCShowAllVolumes
And The All_Volumes should display
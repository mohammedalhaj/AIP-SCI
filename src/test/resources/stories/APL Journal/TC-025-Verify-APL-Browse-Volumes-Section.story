
Scenario: TC-025-APL-Verify Browse Volumes Section.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The TOCBrowseVol should display
And The TOCVolumes should display
And I click on TOCVolumes
And The TOCVolumesLists should display

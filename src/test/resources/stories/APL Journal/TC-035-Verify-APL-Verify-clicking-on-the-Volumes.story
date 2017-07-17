
Scenario: TC-035-APL-Verify clicking on the Volumes.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The TOCBrowseVol should display
And I click on TOCVolumes
And The TOCVolumesLists should display

Scenario: TC-035-JCP-Verify clicking on the Volumes.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The TOCBrowseVol should display
And I click on TOCVolumes
And The TOCVolumesLists should display
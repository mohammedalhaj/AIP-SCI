
Scenario: TC-025-JCP-Verify Browse Volumes Section.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The TOCBrowseVol should display
And The TOCVolumes should display
And I click on TOCVolumes
And The TOCVolumesLists should display

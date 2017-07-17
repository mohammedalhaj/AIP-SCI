
Scenario: TC-035-JAP-Verify clicking on the Volumes.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The TOCBrowseVol should display
And I click on TOCVolumes
And The TOCVolumesLists should display

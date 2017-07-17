
Scenario: TC-041-JAP-Verify Show All Volumes Link.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The TOCShowAllVolumes should display
And I click on TOCShowAllVolumes
And The All_Volumes should display

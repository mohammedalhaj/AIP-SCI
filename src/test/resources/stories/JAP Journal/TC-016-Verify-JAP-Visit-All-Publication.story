
Scenario: TC-016-JAP-Verify Visit All Publications.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on Visit-All-Publications
Then URL page sholud be AipPublishUrl


Scenario: TC-026-JAP-Verify Next And Previous.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The PreviousIssue should display
And I click on PreviousIssue
And The NextIssue should display


Scenario: TC-020-JAP-Verify TOC-Journal-Title.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on ISSUES
Then The TOCTitle should be Journal of Applied Physics

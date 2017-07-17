
Scenario: TC-023-JAP-Verify TOC Header.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on ISSUES
Then The Table-Of-Content should be Table of Contents

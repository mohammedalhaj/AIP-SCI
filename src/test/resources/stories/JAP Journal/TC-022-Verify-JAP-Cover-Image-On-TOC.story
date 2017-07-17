
Scenario: TC-022-JAP-Verify-The "Applied Physics Letters" cover image on TOC page.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on ISSUES
Then The TOCImage should display

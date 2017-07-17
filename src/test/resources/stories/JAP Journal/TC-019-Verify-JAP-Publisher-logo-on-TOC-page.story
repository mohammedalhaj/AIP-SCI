
Scenario: TC-019-JAP-Verify Publisher logo-on-TOC-page.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on ISSUES
Then The AIPLogo should display

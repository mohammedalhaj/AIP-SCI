
Scenario: TC-038-JCP-Verify Author Name On TOC.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The TOCAuthors should display
And I click on TOCAuthors

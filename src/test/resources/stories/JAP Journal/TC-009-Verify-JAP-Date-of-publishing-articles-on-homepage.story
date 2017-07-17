

Scenario: TC-009-JAP-Verify Date-of-publishing-articles-on-homepage.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The ArticleDate should display

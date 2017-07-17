
Scenario: TC-034-JAP-Verify Published Date above each article.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The ArticlePublishDate should display

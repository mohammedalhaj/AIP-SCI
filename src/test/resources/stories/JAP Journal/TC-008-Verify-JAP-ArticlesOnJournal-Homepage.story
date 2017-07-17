
Scenario: TC-008-JAP-Verify Articles On Journal Homepage.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on ArticleONJournals
Then The AbstractArticle should display

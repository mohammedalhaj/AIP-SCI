
Scenario: TC-039-JAP-Verify Citation Line Doi.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then I click on TOCDOI
And The ArticleFullText should display
And The ArticleFigure should display

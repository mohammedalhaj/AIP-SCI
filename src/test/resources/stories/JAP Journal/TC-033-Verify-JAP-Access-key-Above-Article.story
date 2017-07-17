
Scenario: TC-033-JAP-Verify Access key Above Article.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The ArticleAccessKey should display
And I click on TOCArticle
And The ArticleAccessKey should display


Scenario: TC-033-JCP-Verify APL Access key Above Article.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The ArticleAccessKey should display
And I click on TOCArticle
And The ArticleAccessKey should display



Scenario: TC-033-APL-Verify APL Access key Above Article.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The ArticleAccessKey should display
And I click on TOCArticle
And The ArticleAccessKey should display


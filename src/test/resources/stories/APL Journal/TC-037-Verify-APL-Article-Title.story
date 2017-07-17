
Scenario: TC-037-APL-Verify Article Title.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then I click on TOCArticle
And The ArticleHeader should display

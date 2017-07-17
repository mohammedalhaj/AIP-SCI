
Scenario: TC-039-APL-Verify Citation Line Doi.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then I click on TOCDOI
And The ArticleFullText should display
And The ArticleFigure should display

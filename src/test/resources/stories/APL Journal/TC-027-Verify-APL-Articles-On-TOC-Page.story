
Scenario: TC-027-APL-Verify the articles on TOC page.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The ArticleWhiteBox should display
And The TOCArticle should display

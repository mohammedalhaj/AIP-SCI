
Scenario: TC-027-JCP-Verify the articles on TOC page.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then The ArticleWhiteBox should display
And The TOCArticle should display

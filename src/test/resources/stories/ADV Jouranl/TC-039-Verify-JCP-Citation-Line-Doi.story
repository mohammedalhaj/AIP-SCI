
Scenario: TC-039-JCP-Verify Citation Line Doi.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then I click on TOCDOI
And The ArticleFullText should display
And The ArticleFigure should display

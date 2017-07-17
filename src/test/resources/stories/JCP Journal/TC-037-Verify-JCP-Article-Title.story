
Scenario: TC-037-JCP-Verify Article Title.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then I click on TOCArticle
And The ArticleHeader should display


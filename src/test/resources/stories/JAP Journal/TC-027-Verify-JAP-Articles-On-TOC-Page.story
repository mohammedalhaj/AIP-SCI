
Scenario: TC-027-JAP-Verify the articles on TOC page.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then The ArticleWhiteBox should display
And The TOCArticle should display

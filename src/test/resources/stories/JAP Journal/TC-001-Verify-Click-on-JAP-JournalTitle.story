
Scenario: TC-001-JAP-Verify Clicking on Journal Title from Scitation Home page.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then URL page sholud be JAPURL
And The ArticleHeader should be Journal of Applied Physics
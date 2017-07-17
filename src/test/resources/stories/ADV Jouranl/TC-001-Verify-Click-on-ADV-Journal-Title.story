
Scenario: TC-001-ADV-Verify Clicking on Journal Title from Scitation Home page.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
Then URL page sholud be JCPURL
And The ArticleHeader should be AIP Advances
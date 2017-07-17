
Scenario: TC-001-JCP-Verify Clicking on Journal Title from Scitation Home page.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then URL page sholud be JCPURL
And The ArticleHeader should be The Journal of Chemical Physics
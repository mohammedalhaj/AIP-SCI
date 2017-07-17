
Scenario: TC-001-APL-Verify Clicking on Journal Title from Scitation Home page.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then URL page sholud be AIPURL
And The ArticleHeader should be Applied Physics Letters
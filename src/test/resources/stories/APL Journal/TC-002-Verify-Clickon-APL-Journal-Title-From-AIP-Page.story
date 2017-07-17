
Scenario: TC-002-APL-Verify Clicking on Journal Title from AIP Publishing Home page.
 
Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Applied-Physics-Letters
Then URL page sholud be AIPURL
And The ArticleHeader should be Applied Physics Letters

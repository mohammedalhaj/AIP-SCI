
Scenario: TC-002-ADV-Verify Clicking on Journal Title from AIP Publishing Home page.
 
Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Journal-Advance
Then URL page sholud be JCPURL
And The ArticleHeader should be AIP Advances

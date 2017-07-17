
Scenario: TC-002-JCP-Verify Clicking on Journal Title from AIP Publishing Home page.
 
Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Journal-Chemical-Physics
Then URL page sholud be JCPURL
And The ArticleHeader should be The Journal of Chemical Physics

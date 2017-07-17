

Scenario: TC-002-JAP-Verify Clicking on Journal Title from JAP Publishing Home page.
 
Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Journal-Applied-Physics
Then URL page sholud be JAPURL
And The ArticleHeader should be Journal of Applied Physics
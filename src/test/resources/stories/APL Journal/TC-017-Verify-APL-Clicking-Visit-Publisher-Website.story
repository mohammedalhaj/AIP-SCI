
Scenario: TC-017-APL-Verify Visiting Publisher Website.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I scroll To About-Aip-Publisher
And I click on Visit-Publisher-Website
Then URL page sholud be PublisherWebsite 

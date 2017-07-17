
Scenario: TC-017-JAP-Verify Visiting Publisher Website.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I scroll To About-Aip-Publisher
And I click on Visit-Publisher-Website
Then URL page sholud be PublisherWebsite 

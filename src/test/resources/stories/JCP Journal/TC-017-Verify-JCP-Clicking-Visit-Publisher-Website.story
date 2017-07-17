
Scenario: TC-017-APL-Verify Visiting Publisher Website.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I scroll To About-Aip-Publisher
And I click on Visit-Publisher-Website
Then URL page sholud be PublisherWebsite 

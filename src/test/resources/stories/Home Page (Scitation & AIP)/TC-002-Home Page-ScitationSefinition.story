Scenario: TC-002-Home Page-Verify the Scitation definition displays under "Scitation" title.
 
Given I am On ScitationPage
When I Fill Testing procedures to : search_Text
Then The Scitation_Definition should display
Meta:
@production

Scenario: TC-007-Footer -Footer advertising Page 

Given I am On ScitationPage
When I click on ADVERTISER
Then The Advertising_Scitation_Logo should display
And The Advertiser_Resources should display
And The Advertiser_Resources should be Advertiser Resources



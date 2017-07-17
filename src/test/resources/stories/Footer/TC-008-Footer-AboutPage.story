Meta:
@production

Scenario: TC-008-Footer -Footer About Page 

Given I am On ScitationPage
When I click on ABOUT
Then The About_Scitation_Logo should display
And The About_AIP_Publishing should display
And The About_AIP_Publishing should be About AIP Publishing
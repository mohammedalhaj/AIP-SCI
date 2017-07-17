Meta:
@production

Scenario: TC-010-Footer -Footer Help Page 

Given I am On ScitationPage
When I click on HELP
Then The Help_Scitation_Logo should display
And The Help should display
And The Help should be Help

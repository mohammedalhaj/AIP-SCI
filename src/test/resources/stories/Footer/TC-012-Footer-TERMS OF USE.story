Meta:
@production

Scenario: TC-012-Footer -Footer Terms Of Use Page 

Given I am On ScitationPage
When I click on TERMS_OF_USE
Then The Terms_Of_Use_Scitation_Logo should display
And The Terms_Of_Use should display
And The Terms_Of_Use should be Terms Of Use

Meta:
@production

Scenario: TC-009-Footer -Footer Contact Page 

Given I am On ScitationPage
When I click on CONTACT
Then The Contact_Scitation_Logo should display
And The Contact should display
And The Contact should be Contact
And The livSupportImg should display
Meta:
@production

Scenario: TC-011-Footer -Footer Privacy Policy Page 

Given I am On ScitationPage
When I click on PRIVACY_POLICY
Then The Privacy_Policy_Scitation_Logo should display
And The Privacy_Policy should display
And The Privacy_Policy should be Privacy Policy

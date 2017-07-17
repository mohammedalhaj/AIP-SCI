Meta:
@production
Scenario: TC-056-Publications - Verify Author Submit option

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
And I click on Author_Submit
And I switch tabs
Then The Submit_AIP_Advances should be AIP Advances



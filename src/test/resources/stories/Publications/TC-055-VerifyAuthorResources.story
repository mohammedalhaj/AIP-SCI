Meta:
@production
Scenario: TC-055-Publications - Verify Author Resources page

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
And I click on Author_Resources
And I switch tabs
Then The Author_Resource_Title should be Author Resource Center
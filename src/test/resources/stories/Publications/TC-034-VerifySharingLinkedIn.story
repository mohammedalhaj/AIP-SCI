
Scenario: TC-034- Verify LinkedIn sharing

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And I click on Share_link
And I click on Share_LinkedIn
And I switch tabs
Then The LinkedIn_header should display

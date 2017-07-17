
Scenario: TC-030 - Verify the access key above each article

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
Then The access_key_tag should display

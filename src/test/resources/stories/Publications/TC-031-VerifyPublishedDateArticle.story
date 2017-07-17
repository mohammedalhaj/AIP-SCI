Scenario: TC-031 - Verify the Published Date above each article

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
Then The Published_Date should display

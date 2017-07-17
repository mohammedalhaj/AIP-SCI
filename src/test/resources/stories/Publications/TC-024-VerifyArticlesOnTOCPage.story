Scenario: TC-024- Verify the articles on TOC page

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
Then The TOC should display
And The white_section should display
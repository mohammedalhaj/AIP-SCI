Scenario: TC-017-Publications  - Verify Clicking on BROWSE - Navigate to TOC page.

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
And The Publishers_Title should be AIP Advances
And I click on Publications_Browse
Then The TOC should display
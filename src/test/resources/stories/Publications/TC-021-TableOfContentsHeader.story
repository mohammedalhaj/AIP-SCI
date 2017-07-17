Scenario: TC-021-Publications  - Verify the "SUBMIT YOUR ARTICLE" button - TOC page.

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
And The Publishers_Title should be AIP Advances
And I click on Publications_Browse
Then The TOC_Header should display
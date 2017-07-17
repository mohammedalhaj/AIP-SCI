Scenario: TC-022-Publications  - Verify the "Browse Volumes" section.

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
And The Publishers_Title should be AIP Advances
And I click on Publications_Browse
Then The LeftArrow should display
And The RightArrow should display
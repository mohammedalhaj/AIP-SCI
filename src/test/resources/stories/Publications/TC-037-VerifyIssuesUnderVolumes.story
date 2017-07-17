
Scenario: TC-037- Verify clicking on the issues under the volumes

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And I click on expand_arrow
And I click on Issue
Then The issue_header should be Issue 5

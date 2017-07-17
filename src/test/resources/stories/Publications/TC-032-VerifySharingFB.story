Scenario: TC-032- Verify Facebook sharing

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And The show_Abs_Link should be Show Abstract
And I click on Share_link
And I click on Share_FB
And I switch tabs
Then The Facebook_header should be Facebook

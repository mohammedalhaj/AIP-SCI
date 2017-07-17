Scenario: TC-028-Home Page - Verify the AAPT Journals list (on the left side)

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
Then The AAPT_Journal_List Should be American Journal of Physics
And The AAPT_Journal_List Should be The Physics Teacher
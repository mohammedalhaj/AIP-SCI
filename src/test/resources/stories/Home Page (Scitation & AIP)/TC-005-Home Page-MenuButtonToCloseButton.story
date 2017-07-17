Scenario: TC-005-Home Page-Verify MENU button change to CLOSE.
 
Given I am On ScitationPage
When The Menu should display
And I click on Menu
Then The MenuToClose should display
Scenario: TC-016-Search - Verify the Advanced Search page when the user is logged in -  AIP Publishing & Other Publishers.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on publishers_Search_Icon
And I click on Search_Icon
Then The Advanced_Search_Header should display
And The Advanced_Search_Header should be Advanced Search
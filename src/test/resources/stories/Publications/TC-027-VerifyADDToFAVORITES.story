Scenario: TC-027- Verify the existence of on "ADD TO FAVORITES" option

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And The show_Abs_Link should be Show Abstract
And I click on Add_Favorites
And I switch tabs
Then The Favorite_Articles_Title should be Favorite Articles


Scenario: TC-030-APL-Verify APL Add To Favorite.

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then I click on TOCAddToFavorite
And I switch tabs
And The Favorite_Articles_Title should be Favorite Articles

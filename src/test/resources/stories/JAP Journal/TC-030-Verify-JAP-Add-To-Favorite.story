
Scenario: TC-030-JAP-Verify APL Add To Favorite.
 
Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then I click on TOCAddToFavorite
And I switch tabs
And The Favorite_Articles_Title should be Favorite Articles
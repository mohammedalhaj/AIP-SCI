Scenario: TC-026-Search -Verify the "SAVED SEARCHES" in Refine Search section while user is logged in - Subscriber User.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I Fill Testing procedures to : search_Text
And I click on First_Element
When I click on Refine_Search
And I click on Saved_Searches
Then The Search_Name_Header should display
And The Search_Name_Header should be Search Name
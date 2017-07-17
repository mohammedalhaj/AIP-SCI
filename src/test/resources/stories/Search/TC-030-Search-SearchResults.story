Scenario: TC-030-Search - Verify The search results.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I Fill Testing procedures to : search_Text
When I click on First_Element
Then The First_search_Result should display


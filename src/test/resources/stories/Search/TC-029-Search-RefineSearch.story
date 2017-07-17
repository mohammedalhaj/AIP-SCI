Scenario: TC-029-Search - Verify "REFINE SEARCH" section.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I Fill Testing procedures to : search_Text
When I click on First_Element
And I click on Refine_Search
Then The Saved_Searches should display
And The Search_History should display

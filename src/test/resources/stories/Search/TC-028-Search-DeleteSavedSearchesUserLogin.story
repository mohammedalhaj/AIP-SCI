Scenario: TC-028-Search - Verify Deleting the "SAVED SEARCHES"  from Refine Search section.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I Fill Testing procedures to : search_Text
And I click on First_Element
When I click on Refine_Search
And I click on Saved_Searches
And The Search_Name_Header should be Search Name
And I click on DeleteFirst_Saved_Search
Then The Delete_Saved_Search_Page should display
Then The Delete_Saved_Search_Page should be Saved search name:


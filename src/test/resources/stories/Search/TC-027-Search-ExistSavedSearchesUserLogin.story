Scenario: TC-027-Search - Verify the functionality of "SAVED SEARCHES"  in Refine Search section.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I Fill Testing procedures to : search_Text
And I click on First_Element
When I click on Refine_Search
And I click on Saved_Searches
And The Search_Name_Header should be Search Name
Then I click on Saved_Search_Name
And The Results should be Results 
And The Search_TextBox should display
And The Refine_Search should be Refine Search
And The SortLabel should be Sort:  
And The PaginationSearchResult should display
Scenario: TC-017-Search - Verify the functionality of the Advanced Search when the user is logged in - AIP Publishing & Other Publishers.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on publishers_Search_Icon
And I click on Search_Icon
And The Advanced_Search_Header should be Advanced Search
And I Fill Testing procedures to : Advanced_Search_TextBox
And I click on Advanced_Search_Btn
Then The Results should display
And The Results should be Results 
And The Search_TextBox should display
And The Refine_Search should be Refine Search
And The SortLabel should be Sort:  
And The PaginationSearchResult should display
Scenario: TC-021-Search -Verify the functionality of "Publication Date-Last" - Advanced Search

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
When I click on Search_Icon
And The Advanced_Search_Header should be Advanced Search
And I Fill study to : Advanced_Search_TextBox
And I click on Static_Range
And I click on Static_Range_DDL
And I click on Static_Range_6months
And I click on Advanced_Search_Btn
Then The Results should display
And The Results should be Results 
And The Search_TextBox should display
And The Refine_Search should be Refine Search
And The SortLabel should be Sort:  
And The PaginationSearchResult should display
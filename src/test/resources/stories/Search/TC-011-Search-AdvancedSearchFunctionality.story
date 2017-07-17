Scenario: TC-011-Search -Verify the functionality of the Advanced Search when the user is logged out - Scitation home page.
Given I am On ScitationPage
When The Search_Icon should display
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
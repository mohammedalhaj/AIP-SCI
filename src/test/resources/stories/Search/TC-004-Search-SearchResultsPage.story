Meta:
@production

Scenario: TC-004-Search - Verify that search results page come up 

Given I am On ScitationPage
When I Fill Theory to : search_Text
And I click on First_Element
Then The Results should display
And The Results should be Results 
And The Search_TextBox should display
And The Refine_Search should be Refine Search
And The SortLabel should be Sort:  
And The PaginationSearchResult should display
Scenario: TC-024-Search - Verify view "SAVED SEARCHES"  in Refine Search section while user is logged out - Guest User.

Given I am On ScitationPage
And I Fill Testing procedures to : search_Text
And I click on First_Element
When I click on Refine_Search
And I click on Saved_Searches
Then The Saved_Search_Text should display
And The Saved_Search_Text should be Please login to view your saved searches.
Scenario: TC-023-Search - Verify Save Search while user is logged out - Guest User.

Given I am On ScitationPage
And I Fill Testing procedures to : search_Text
And I click on First_Element
When I click on Save_Search_Btn
Then The SaveSearch_Login_Msg should display
And The SaveSearch_Login_Msg should be Please login to be able to save your searches and receive alerts for new content matching your search criteria.
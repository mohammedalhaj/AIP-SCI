Meta:
@production


Scenario: TC-002-Search - A user searching for an article, finding the article, logging in and accessing the full-text

Given I am On ScitationPage
And I Fill Testing procedures to : search_Text
And I click on First_Element
And I click on First_search_Result
And I click on Full_Text
And The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS
And The username should display
And The password should display
And The Login_Button should display
When I Fill mnajjar@aspire-infotech.net to : username
And I Fill Password123! to : password
And I click on Login_Button
Then The Profile_Welcome should be Mohammed Najjar
And The REFERENCES should display

Meta:
@production

Scenario: TC-001-Search - Search without login for full text article
 
Given I am On ScitationPage
And I Fill Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics to : search_Text
And I click on SearchIcon
And I click on First_search_Result
And I click on Full_Text
Then The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS
And The username should display
And The password should display
And The Login_Button should display
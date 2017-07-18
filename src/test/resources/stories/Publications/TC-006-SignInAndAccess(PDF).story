Meta:
@production

Scenario: TC-006-Publications  - Sign in and access a PDF

Given I am On ScitationPage
And I Fill Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics to : search_Text
And I click on SearchIcon
And I click on First_search_Result
And I click on Full_Text
And The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS
When I Fill mnajjar@aspire-infotech.net to : username
And I Fill Password123! to : password
And I click on Login_Button
Then I click On PDF and PDF Should open properly
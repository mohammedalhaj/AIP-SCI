Meta:
@production

Scenario: TC-007-Publications  - While not logged in , Try to access the PDF

Given I am On ScitationPage
When I Fill Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics to : search_Text
And I click on SearchIcon
And I click on First_search_Result
And I click on Access_PDF
Then The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS

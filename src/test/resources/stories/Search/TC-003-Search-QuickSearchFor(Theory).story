Meta:
@production

Scenario: TC-003-Search - Search  for Theory

Given I am On ScitationPage
When I Fill Theory to : search_Text
And I click on First_Element
Then The Results should display
And The Results should be Results

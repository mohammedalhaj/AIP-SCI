Meta:
@production
Scenario: TC-025- Physics Today- verify most read article page

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Most_read_articles
Then The Physics_Today_header should display
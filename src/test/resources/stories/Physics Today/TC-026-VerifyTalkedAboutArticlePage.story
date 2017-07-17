Meta:
@production
Scenario: TC-026- Physics Today- verify talked about article page

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Talked_about
And I click on Talked_about_articles
Then The Physics_Today_header should display
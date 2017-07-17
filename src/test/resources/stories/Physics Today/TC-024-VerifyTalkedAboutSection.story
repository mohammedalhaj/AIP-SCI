Meta:
@production
Scenario: TC-024- Physics Today- verify talked about section

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Talked_about
Then The Talked_about_articles should display
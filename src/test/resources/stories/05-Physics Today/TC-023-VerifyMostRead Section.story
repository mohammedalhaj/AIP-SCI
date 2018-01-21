Meta:
@production
Scenario: TC-023- Physics Today- verify most read section

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Most_read should be Most Read
And The Most_read_articles should display
And The Most_read_articles_date should display
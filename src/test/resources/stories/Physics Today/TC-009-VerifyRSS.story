Meta:
@production
Scenario: TC-009- Physics Today- Verify RSS

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on RSS
And I switch tabs
Then The Rss_page should display
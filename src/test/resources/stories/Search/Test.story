Meta:
@production
Scenario: TC-Test.

Given I am On RssPage
And I click on AddRssPlugin
When I Use Robot
Then The AddRssPlugin should display
Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on RSS
And I switch tabs
Then The Rss_page should display
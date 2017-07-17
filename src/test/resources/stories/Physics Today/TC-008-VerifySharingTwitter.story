Meta:
@production
Scenario: TC-008- Physics Today- Verify Twitter sharing

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on Share_twitter_PT
And I switch tabs
Then page URL should be https://twitter.com/physicstoday




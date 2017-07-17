Meta:
@production
Scenario: TC-028- Physics Today- Verify Subscribe Banner

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on banner_subscribe
Then The Left_Title should be Login Required

Meta:
@production
Scenario: TC-007- Physics Today- Verify Facebook sharing

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on Share_FB_PT
And I switch tabs
Then page URL should be https://www.facebook.com/PhysicsToday/


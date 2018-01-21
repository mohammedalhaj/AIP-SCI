Meta:
@production
Scenario: TC-010- Physics Today- Verify subscribe button

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on Physics_Today_subscribe_btn
Then The Physics_Today_subscribe_page should be Thank you for your interest in Physics Today.

Meta:
@production
Scenario: TC-003- Physics Today- verify the function of PhysicsToday journal image

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
Then The Physics_Today_header should display
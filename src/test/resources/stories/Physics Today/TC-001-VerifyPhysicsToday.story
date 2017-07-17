Meta:
@production
Scenario: TC-001- Physics Today- Verify the existence of PhysicsToday publication

Given I am On ScitationPage
When I click on AIP_Publisher
Then The Physics_Today_Journal should display
And The Physics_Today_image should display
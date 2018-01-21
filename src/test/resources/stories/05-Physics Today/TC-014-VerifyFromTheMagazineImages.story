Meta:
@production
Scenario: TC-014- Physics Today- Verify PhysicsToday From The Magazine imagess

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Magazine_image1 should display
And The Magazine_image2 should display
And The Magazine_image3 should display
And The Magazine_image4 should display

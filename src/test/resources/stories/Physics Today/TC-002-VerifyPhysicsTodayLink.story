Meta:
@production
Scenario: TC-002- Physics Today- verify the function of PhysicsToday journal link

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Physics_Today_header should display
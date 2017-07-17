Meta:
@production
Scenario: TC-011- Physics Today- Verify Physics Tody tabs

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
Then The Physics_Today_Home should be HOME
And The Physics_Today_browse should be BROWSE
And The Physics_Today_Info should be INFO
And The Physics_Today_Jobs should be JOBS
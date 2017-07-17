Meta:
@production
Scenario: TC-006- Physics Today- verify the function of  Physicstoday title link

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
And I click on Physics_Today_header
And The Ad should display
And The share_section should display
And The SignUpForAlerts should display
And The SUBSCRIBE should display
And The Journal_tabs should display


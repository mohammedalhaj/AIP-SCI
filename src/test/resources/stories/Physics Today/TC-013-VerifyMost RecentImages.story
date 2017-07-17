Meta:
@production
Scenario: TC-013- Physics Today- Verify PhysicsToday Most Recent Online Stories images

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Most_Recent_image1 should display
And The Most_Recent_image2 should display
And The Most_Recent_image3 should display
And The Most_Recent_image4 should display
And The Most_Recent_image5 should display
And The Most_Recent_image6 should display

Meta:
@production
Scenario: TC-015- Physics Today- verify Latest Magazine Issues images

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Latest_image1 should display
And The Latest_image2 should display
And The Latest_image3 should display
And The Latest_image4 should display
And The Latest_image5 should display
And The Latest_image6 should display
And The Latest_image7 should display

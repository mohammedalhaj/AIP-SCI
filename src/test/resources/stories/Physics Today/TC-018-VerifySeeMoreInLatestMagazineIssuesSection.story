Meta:
@production
Scenario: TC-018- Physics Today- verify see more in Latest Magazine Issues section

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Latest_Magazine_See_More
Then The Latest_Issues_page should be Table of Contents
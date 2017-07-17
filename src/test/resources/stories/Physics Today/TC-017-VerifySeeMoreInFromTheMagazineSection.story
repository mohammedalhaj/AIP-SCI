Meta:
@production
Scenario: TC-017- Physics Today- verify see more in From The Magazine section

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Magazine_See_More
Then The Latest_Issues_page should be Table of Contents
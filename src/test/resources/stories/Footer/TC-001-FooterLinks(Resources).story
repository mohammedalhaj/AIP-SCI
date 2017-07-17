Meta:
@production


Scenario: TC-001-Footer - Verify the existence of Resources section
Given I am On ScitationPage
When The Resources should display
Then The AUTHOR should display
And The LIBRARIAN should display
And The ADVERTISER should display
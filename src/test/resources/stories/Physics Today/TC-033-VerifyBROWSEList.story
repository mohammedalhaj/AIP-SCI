Scenario: TC-033- Physics Today- Verify the "BROWSE" dropdown list

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on BROWSE_List
Then The The_Magazine should be The Magazine
And The Research_Technology should be Research & Technology
And The Politics_Policy should be Politics & Policy
And The Commentary_Reviews should be Commentary & Reviews
And The People_History should be People & History
And The Careers_Education should be Careers & Education

Scenario: TC-051-APL-Verify Clicking On News Tab.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over INFO
And I click on InfoNews
And The NewsHeader should display

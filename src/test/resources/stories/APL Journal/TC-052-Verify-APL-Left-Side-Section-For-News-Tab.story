
Scenario: TC-052-APL-Verify Left Side Section For News Tab.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over INFO
And I click on InfoNews
And The NewsAndAnnouncement should display
And The ArticleInTheNews should display


Scenario: TC-034- Physics Today- Verify  Existance Of Sort Filter section

Given I am On ScitationPage
When I click on  Menu
And I click on PhysicsToday
And I click on Article
And I switch to frame commentFrame
Then The comment should display
And The sortFilter should display
And I click on sortFilter
And The filterList should display
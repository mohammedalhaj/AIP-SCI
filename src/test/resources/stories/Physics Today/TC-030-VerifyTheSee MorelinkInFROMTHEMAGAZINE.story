
Scenario: TC-030- Physics Today- Verify See More Link in From The Magazine

Given I am On ScitationPage
When I click on  Menu
And I click on PhysicsToday
Then The FromTheMagazine should be FROM THE MAGAZINE
And I click on MagazineSeeMore
Then URL page sholud be ArticlePage
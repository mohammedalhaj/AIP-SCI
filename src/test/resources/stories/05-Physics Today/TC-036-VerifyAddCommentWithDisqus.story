
Scenario: TC-036- Physics Today- Verify Login and Add Comment With Disqus

Given I am On physicstoday
When I click on Article
And I switch to frame commentFrame
And I scroll To comment
And I click on LoginOnComment
Then I click on Disqus
And I switch to window


Meta:
@production
Scenario: TC-022- Physics Today- verify view all jobs page

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on view_all_jobs
Then page URL should be https://jobs.physicstoday.org

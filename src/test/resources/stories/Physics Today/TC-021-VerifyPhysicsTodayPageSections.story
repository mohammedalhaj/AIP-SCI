Meta:
@production
Scenario: TC-021- Physics Today-Verify Physic Today Page Sections

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Physics_Today_Home_Title should display
And The published_date should display
And The Most_Recent_Online_Stories should be Most Recent Online Stories
And The Most_Read should be Most Read
And The From_The_Magazine should be From The Magazine
And The Latest_Physics_Jobs should be Latest Physics Jobs
And The Latest_Magazine_Issues should be Latest Magazine Issues

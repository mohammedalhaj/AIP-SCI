Meta:
@production

Scenario: TC-003-Publishers - Verify the Home page for Publishers

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
Then The AIP_Publishers_Logo should display
And The About_publishers Should be About AIP Publishing
And The About_publishers Should be About the Acoustical Society of America
And The About_publishers Should be About American Association of Physics Teachers
And The About_publishers Should be About American Crystallographic Association, Inc.
And The About_publishers Should be About AVS: Science & Technology of Materials, Interfaces, and Processing
And The About_publishers Should be About Chinese Physical Society
And The About_publishers Should be About Laser Institute of America
And The About_publishers Should be About The Society of Rheology
And The AIP publisher Logo Should Dispaly
And The asa publisher Logo Should Dispaly
And The aapt publisher Logo Should Dispaly
And The aca publisher Logo Should Dispaly
And The avs publisher Logo Should Dispaly
And The cps publisher Logo Should Dispaly
And The lia publisher Logo Should Dispaly
And The sor publisher Logo Should Dispaly


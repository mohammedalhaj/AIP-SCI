Meta:
@production

Scenario: TC-001-Publishers - Verify Publishers option in Menu List

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1030] Menu_Publishers should be presence, Within 20 seconds
And [1000-9140] Close the browser

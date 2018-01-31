Meta:
@production

Scenario: TC-003-Search - Search  for Theory

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1080] Theory should be displayed, Within 20 seconds
And [1100-1340] User fills search_Text with Theory
And [1111-1000] first_Element should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] Results text should contain Results, Within 20 seconds

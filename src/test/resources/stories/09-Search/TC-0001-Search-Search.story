Meta:
@production

Scenario: TC-0001-Search - Search without login for full text article
 
Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1080] search_Text should be displayed, Within 20 seconds
And [1100-1340] User fills search_Text with Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics
And [1111-1000] searchIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] first_Search_Result should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] full_Text should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1130] access_Message text should contain SELECT YOUR ACCESS, Within 20 seconds
And [1101-1080] User Name should be displayed
And [1101-1080] Password should be displayed
And [1101-1080] Login Button should be displayed
Meta:
@production

Scenario: TC-054-Publications - Verify Publication Charges page

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Menu_Publishers should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publishers_Logo should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Aip_Advances should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
And [1111-1000] for_Authors_Advance should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Publication_Charges should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] Left_Title text should contain Publication Charges, Within 20 seconds
And [1111-1130] header_Title text should contain Publication Charges, Within 20 seconds
And [1000-9140] Close the browser
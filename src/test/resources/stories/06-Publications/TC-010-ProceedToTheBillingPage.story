Meta:
@production

Scenario: TC-010-Publications - Verify you can proceed to the billing page 

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1100-1340] User fills search_Text with `searchvalue`
And [1111-1000] SearchIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] first_Search_Result should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Full_Text should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1130] Access_Message text should contain SELECT YOUR ACCESS, Within 20 seconds
And [1111-1000] Add_To_Cart_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] Shopping_Cart text should contain Shopping Cart, Within 20 seconds
And [1111-1130] Price text should contain PRICE, Within 20 seconds
And [1101-1080] Price_Number should be displayed
And [1111-1000] Checkout_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1340] User fills User Name with MHamad@aspire-infotech.net
And [1100-1340] User fills Password with Test@123456
And [1111-1000] signin_Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] billing_Information text should contain Billing Information, Within 20 seconds

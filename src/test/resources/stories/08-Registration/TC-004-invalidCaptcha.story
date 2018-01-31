Meta:
@production

Scenario: TC-004-Registration -Verify the invalid Captcha in registration page.

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] the_SignIn_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] the_Register_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] registeration_Firstname_Textbox should be displayed, Within 20 seconds
And [1100-1340] User fills registeration_Firstname_Textbox with MAlhaj
And [1100-1340] User fills registeration_Lasttname_Textbox with Adnan
And [1100-1340] User fills registeration_Email_Textbox with Email@Email.com
And [1100-1340] User fills registeration_Password_Textbox with Test@123
And [1111-1000] terms_Of_Use should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1340] User fills captcha_Textbox with TEST
Then [1111-1000] registerationpage_Register_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] captcha_Invalid_Msg text should contain Captcha is invalid, Within 20 seconds
Meta:
@production

Scenario: TC-007-Google Verification- Google Site Verification for AVS

Given [1000-9110] User navigate to http://avs.scitation.org/google5f73376c9a2dc875.html URL
Then [1111-1080] google_Verfication should be displayed, Within 20 seconds
And [1101-0140] Text should contain google-site-verification: google5f73376c9a2dc875.html

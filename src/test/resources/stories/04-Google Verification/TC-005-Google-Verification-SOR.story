Meta:
@production

Scenario: TC-005-Google Verification- Google Site Verification for SOR

Given [1000-9110] User navigate to http://sor.scitation.org/google5f73376c9a2dc875.html URL
Then [1111-1080] google_Verfication should be displayed, Within 20 seconds
And [1101-0140] Text should contain google-site-verification: google5f73376c9a2dc875.html

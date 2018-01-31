package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
//import com.aspire.pxp.pages.common.SiteCommonElements;

@Page(name="login",url="${pages.login.url}")
public interface LoginPage {

	@CssSelector("${pages.login.username}")
	public AspireWebElement userName(); 

	@CssSelector("${pages.login.password}")
	public AspireWebElement password(); 

	@CssSelector("${pages.login.loginButton}")
	public AspireWebElement loginButton();
	
	@CssSelector("${pages.login.the_Login_Button}")
	public AspireWebElement the_Login_Button();
	
	@CssSelector("${pages.login.profile_Welcome}")
	public AspireWebElement profile_Welcome(); 

	@CssSelector("${pages.login.profile}")
	public AspireWebElement profile(); 

	@CssSelector("${pages.login.logout}")
	public AspireWebElement logout(); 

	@CssSelector("${pages.login.signin_Btn}")
	public AspireWebElement signin_Btn(); 

	@CssSelector("${pages.login.keepmeloggedin_Switch}")
	public AspireWebElement keepmeloggedin_Switch(); 

	@CssSelector("${pages.login.signInErrorMsg}")
	public AspireWebElement signInErrorMsg(); 

	@CssSelector("${pages.login.forgot_Password}")
	public AspireWebElement forgot_Password(); 

	@CssSelector("${pages.login.forgotpassword_Dialog_Header}")
	public AspireWebElement forgotpassword_Dialog_Header(); 

	@CssSelector("${pages.login.forgotpassword_Dialog_Emailtextbox}")
	public AspireWebElement forgotpassword_Dialog_Emailtextbox(); 

	@CssSelector("${pages.login.login_Button}")
	public AspireWebElement login_Button();
	
	@CssSelector("${pages.login.signin_Button}")
	public AspireWebElement signin_Button();
	
		
}













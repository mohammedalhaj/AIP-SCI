package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "register", url = "")
public interface Registration {

	
	
	@CssSelector("${pages.register.the_SignIn_Btn}")
	public AspireWebElement the_SignIn_Btn();

	@CssSelector("${pages.register.the_Register_Btn}")
	public AspireWebElement the_Register_Btn();

	@CssSelector("${pages.register.registerationpage_Headline}")
	public AspireWebElement registerationpage_Headline();
	
	@CssSelector("${pages.register.registerationpage_Register_Btn}")
	public AspireWebElement registerationpage_Register_Btn();

	@CssSelector("${pages.register.registeration_Firstname_Textbox}")
	public AspireWebElement registeration_Firstname_Textbox();

	@CssSelector("${pages.register.registeration_Lasttname_Textbox}")
	public AspireWebElement registeration_Lasttname_Textbox();

	@CssSelector("${pages.register.registeration_Email_Textbox}")
	public AspireWebElement registeration_Email_Textbox();

	@CssSelector("${pages.register.registeration_Password_Textbox}")
	public AspireWebElement registeration_Password_Textbox();

	@CssSelector("${pages.register.registeration_Offersbyemail_Checkbox}")
	public AspireWebElement registeration_Offersbyemail_Checkbox();

	@CssSelector("${pages.register.registerationpage_Cancel_Btn}")
	public AspireWebElement registerationpage_Cancel_Btn();

	@CssSelector("${pages.register.registerationpage_Errormsg}")
	public AspireWebElement registerationpage_Errormsg();

	@CssSelector("${pages.register.registeration_Thanks_Msg}")
	public AspireWebElement registeration_Thanks_Msg();

	@CssSelector("${pages.register.password_Tooshort}")
	public AspireWebElement password_Tooshort();

	@CssSelector("${pages.register.password_Weak}")
	public AspireWebElement password_Weak();

	@CssSelector("${pages.register.password_Medium}")
	public AspireWebElement password_Medium();

	@CssSelector("${pages.register.password_Strong}")
	public AspireWebElement password_Strong();

	@CssSelector("${pages.register.captcha_Invalid_Msg}")
	public AspireWebElement captcha_Invalid_Msg();

	@CssSelector("${pages.register.captcha_Textbox}")
	public AspireWebElement captcha_Textbox();
	
	@CssSelector("${pages.register.terms_Of_Use}")
	public AspireWebElement terms_Of_Use();
	
	@CssSelector("${pages.register.references}")
	public AspireWebElement references();
	
	@CssSelector("${pages.register.first_Element}")
	public AspireWebElement first_Element();
	
	@CssSelector("${pages.register.results}")
	public AspireWebElement results();
}

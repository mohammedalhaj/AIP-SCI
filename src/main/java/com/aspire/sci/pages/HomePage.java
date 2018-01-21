package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "home", url = "${pages.home.url}")
public interface HomePage {

	@CssSelector("${pages.home.resources}")
	public AspireWebElement resources();

	@CssSelector("${pages.home.author}")
	public AspireWebElement author();
	
	@CssSelector("${pages.home.google_Verfication}")
	public AspireWebElement google_Verfication();
	
	@CssSelector("${pages.home.librarian}")
	public AspireWebElement librarian();

	@CssSelector("${pages.home.advertiser}")
	public AspireWebElement advertiser();

	@CssSelector("${pages.home.general_Information}")
	public AspireWebElement general_Information();

	@CssSelector("${pages.home.about}")
	public AspireWebElement about();

	@CssSelector("${pages.home.contact}")
	public AspireWebElement contact();

	@CssSelector("${pages.home.help}")
	public AspireWebElement help();

	@CssSelector("${pages.home.privacy_Policy}")
	public AspireWebElement privacy_Policy();

	@CssSelector("${pages.home.terms_Of_Use}")
	public AspireWebElement terms_Of_Use();

	@CssSelector("${pages.home.follow_Aip_Publishing}")
	public AspireWebElement follow_Aip_Publishing();

	@CssSelector("${pages.home.facebook_Icon}")
	public AspireWebElement facebook_Icon();

	@CssSelector("${pages.home.twitter_Icon}")
	public AspireWebElement twitter_Icon();

	@CssSelector("${pages.home.linkedin_Icon}")
	public AspireWebElement linkedin_Icon();

	@CssSelector("${pages.home.page_Footer}")
	public AspireWebElement page_Footer();

	@CssSelector("${pages.home.footer_Copyright}")
	public AspireWebElement footer_Copyright();

	@CssSelector("${pages.home.author_Resource_Center}")
	public AspireWebElement author_Resource_Center();

	@CssSelector("${pages.home.aip_Scitation}")
	public AspireWebElement aip_Scitation();

	@CssSelector("${pages.home.aip_China}")
	public AspireWebElement aip_China();

	@CssSelector("${pages.home.authors_About}")
	public AspireWebElement authors_About();

	@CssSelector("${pages.home.authors_Publications}")
	public AspireWebElement authors_Publications();

	@CssSelector("${pages.home.authors_Librarians}")
	public AspireWebElement authors_Librarians();

	@CssSelector("${pages.home.authors_Authors}")
	public AspireWebElement authors_Authors();

	@CssSelector("${pages.home.authors_Publishing_Partners}")
	public AspireWebElement authors_Publishing_Partners();

	@CssSelector("${pages.home.authors_Advertising_Resources}")
	public AspireWebElement authors_Advertising_Resources();

	@CssSelector("${pages.home.authors_Careers}")
	public AspireWebElement authors_Careers();

	@CssSelector("${pages.home.authors_Contact_Us}")
	public AspireWebElement authors_Contact_Us();

	@CssSelector("${pages.home.before_You_Begin}")
	public AspireWebElement before_You_Begin();

	@CssSelector("${pages.home.prepare_Your_Manuscript}")
	public AspireWebElement prepare_Your_Manuscript();

	@CssSelector("${pages.home.submit_Your_Manuscript}")
	public AspireWebElement submit_Your_Manuscript();

	@CssSelector("${pages.home.Library_Resource_Center}")
	public AspireWebElement Library_Resource_Center();

	@CssSelector("${pages.home.promote_Your_Collection}")
	public AspireWebElement promote_Your_Collection();

	@CssSelector("${pages.home.manage_Your_Collection}")
	public AspireWebElement manage_Your_Collection();

	@CssSelector("${pages.home.help_Scitation_Logo}")
	public AspireWebElement help_Scitation_Logo();

	@CssSelector("${pages.home.privacy_Policy_Scitation_Logo}")
	public AspireWebElement privacy_Policy_Scitation_Logo();

	@CssSelector("${pages.home.terms_Of_Use_Scitation_Logo}")
	public AspireWebElement terms_Of_Use_Scitation_Logo();

	@CssSelector("${pages.home.about_Scitation_Logo}")
	public AspireWebElement about_Scitation_Logo();

	@CssSelector("${pages.home.about_AIP_Publishing}")
	public AspireWebElement about_AIP_Publishing();

	@CssSelector("${pages.home.advertising_Scitation_Logo}")
	public AspireWebElement advertising_Scitation_Logo();

	@CssSelector("${pages.home.advertiser_Resources}")
	public AspireWebElement advertiser_Resources();

	@CssSelector("${pages.home.contact_Scitation_Logo}")
	public AspireWebElement contact_Scitation_Logo();

	@CssSelector("${pages.home.customer_Service_Query_Radiobtn}")
	public AspireWebElement customer_Service_Query_Radiobtn();

	@CssSelector("${pages.home.technical_Support_Radiobtn}")
	public AspireWebElement technical_Support_Radiobtn();

	@CssSelector("${pages.home.editorial_Feedback_Radiobtn}")
	public AspireWebElement editorial_Feedback_Radiobtn();

	@CssSelector("${pages.home.name_Textbox}")
	public AspireWebElement name_Textbox();

	@CssSelector("${pages.home.email_Textbox}")
	public AspireWebElement email_Textbox();

	@CssSelector("${pages.home.account_Number_Textbox}")
	public AspireWebElement account_Number_Textbox();

	@CssSelector("${pages.home.journal}")
	public AspireWebElement journal();

	@CssSelector("${pages.home.comments_Textbox}")
	public AspireWebElement comments_Textbox();

	@CssSelector("${pages.home.contact_Submitbtn}")
	public AspireWebElement contact_Submitbtn();

	@CssSelector("${pages.home.contact_Clearbtn}")
	public AspireWebElement contact_Clearbtn();

	@CssSelector("${pages.home.livSupportImg}")
	public AspireWebElement livSupportImg();

	@CssSelector("${pages.home.library_Resource_Center}")
	public AspireWebElement library_Resource_Center();

	@CssSelector("${pages.home.contact_Main}")
	public AspireWebElement contact_Main();

	@CssSelector("${pages.home.help_Main}")
	public AspireWebElement help_Main();

	@CssSelector("${pages.home.privacy_Policy_Main}")
	public AspireWebElement privacy_Policy_Main();

	@CssSelector("${pages.home.terms_Of_Use_Main}")
	public AspireWebElement terms_Of_Use_Main();

	@CssSelector("${pages.home.author_Main}")
	public AspireWebElement author_Main();

	@CssSelector("${pages.home.librarian_Main}")
	public AspireWebElement librarian_Main();

	@CssSelector("${pages.home.advertiser_Main}")
	public AspireWebElement advertiser_Main();

	@CssSelector("${pages.home.about_Main}")
	public AspireWebElement about_Main();

	@CssSelector("${pages.home.terms_Of_Use_Main}")
	public AspireWebElement follow_Aip_Publishing_Main();
	
	@CssSelector("${pages.home.the_Terms_Of_Use}")
	public AspireWebElement the_Terms_Of_Use();
	

}
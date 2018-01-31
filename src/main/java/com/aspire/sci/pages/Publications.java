package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "publications", url = "")
public interface Publications {

	@CssSelector("${pages.publications.menu}")
	public AspireWebElement menu();

	@CssSelector("${pages.publications.menu_Publishers}")
	public AspireWebElement menu_Publishers();

	@CssSelector("${pages.publications.aip_Publishers_Logo}")
	public AspireWebElement aip_Publishers_Logo();

	@CssSelector("${pages.publications.publishers_Title}")
	public AspireWebElement publishers_Title();

	@CssSelector("${pages.publications.aip_Advances}")
	public AspireWebElement aip_Advances();

	@CssSelector("${pages.publications.publishers_Logo}")
	public AspireWebElement publishers_Logo();

	@CssSelector("${pages.publications.publishers_Home}")
	public AspireWebElement publishers_Home();

	@CssSelector("${pages.publications.publishers_Browse}")
	public AspireWebElement publishers_Browse();

	@CssSelector("${pages.publications.publications_Browse}")
	public AspireWebElement publications_Browse();

	@CssSelector("${pages.publications.info}")
	public AspireWebElement info();

	@CssSelector("${pages.publications.apl_Materials}")
	public AspireWebElement apl_Materials();

	@CssSelector("${pages.publications.toc}")
	public AspireWebElement toc();

	@CssSelector("${pages.publications.browse_Volumes}")
	public AspireWebElement browse_Volumes();

	@CssSelector("${pages.publications.listof_Browse_Volumes}")
	public AspireWebElement listof_Browse_Volumes();

	@CssSelector("${pages.publications.pagenation}")
	public AspireWebElement pagenation();

	@CssSelector("${pages.publications.display}")
	public AspireWebElement display();

	@CssSelector("${pages.publications.left_Arrow}")
	public AspireWebElement left_Arrow();

	@CssSelector("${pages.publications.physics_Today_Info}")
	public AspireWebElement physics_Today_Info();

	@CssSelector("${pages.publications.physics_Today_Jobs}")
	public AspireWebElement physics_Today_Jobs();

	@CssSelector("${pages.publications.physics_Today_Signup_Alerts}")
	public AspireWebElement physics_Today_Signup_Alerts();

	@CssSelector("${pages.publications.journal_Alerts_Page}")
	public AspireWebElement journal_Alerts_Page();

	@CssSelector("${pages.publications.most_Recent_Image1}")
	public AspireWebElement most_Recent_Image1();

	@CssSelector("${pages.publications.most_Recent_Image2}")
	public AspireWebElement most_Recent_Image2();

	@CssSelector("${pages.publications.most_Recent_Image3}")
	public AspireWebElement most_Recent_Image3();

	@CssSelector("${pages.publications.most_Recent_Image4}")
	public AspireWebElement most_Recent_Image4();

	@CssSelector("${pages.publications.most_Recent_Image5}")
	public AspireWebElement most_Recent_Image5();

	@CssSelector("${pages.publications.most_Recent_Image6}")
	public AspireWebElement most_Recent_Image6();

	@CssSelector("${pages.publications.magazine_See_More}")
	public AspireWebElement magazine_See_More();

	@CssSelector("${pages.publications.magazine_Image1}")
	public AspireWebElement magazine_Image1();

	@CssSelector("${pages.publications.magazine_Image2}")
	public AspireWebElement magazine_Image2();

	@CssSelector("${pages.publications.magazine_Image3}")
	public AspireWebElement magazine_Image3();

	@CssSelector("${pages.publications.magazine_Image4}")
	public AspireWebElement magazine_Image4();

	@CssSelector("${pages.publications.magazineSeeMore}")
	public AspireWebElement magazineSeeMore();

	@CssSelector("${pages.publications.latest_Magazine_See_More}")
	public AspireWebElement latest_Magazine_See_More();

	@CssSelector("${pages.publications.latest_Image1}")
	public AspireWebElement latest_Image1();

	@CssSelector("${pages.publications.latest_Image2}")
	public AspireWebElement latest_Image2();

	@CssSelector("${pages.publications.latest_Image3}")
	public AspireWebElement latest_Image3();

	@CssSelector("${pages.publications.latest_Image4}")
	public AspireWebElement latest_Image4();

	@CssSelector("${pages.publications.latest_Image5}")
	public AspireWebElement latest_Image5();

	@CssSelector("${pages.publications.latest_Image6}")
	public AspireWebElement latest_Image6();

	@CssSelector("${pages.publications.latest_Image7}")
	public AspireWebElement latest_Image7();

	@CssSelector("${pages.publications.most_Recent_See_More}")
	public AspireWebElement most_Recent_See_More();

	@CssSelector("${pages.publications.all_Departments}")
	public AspireWebElement all_Departments();

	@CssSelector("${pages.publications.latest_Issues_Page}")
	public AspireWebElement latest_Issues_Page();

	@CssSelector("${pages.publications.physicsTodayAdFrame}")
	public AspireWebElement physicsTodayAdFrame();

	@CssSelector("${pages.publications.first_Ad_Right}")
	public AspireWebElement first_Ad_Right();

	@CssSelector("${pages.publications.second_Ad_Right}")
	public AspireWebElement second_Ad_Right();

	@CssSelector("${pages.publications.secondFrame}")
	public AspireWebElement secondFrame();

	@CssSelector("${pages.publications.published_Date}")
	public AspireWebElement published_Date();

	@CssSelector("${pages.publications.physics_Today_Home_Title}")
	public AspireWebElement physics_Today_Home_Title();

	@CssSelector("${pages.publications.most_Recent_Online_Stories}")
	public AspireWebElement most_Recent_Online_Stories();

	@CssSelector("${pages.publications.from_The_Magazine}")
	public AspireWebElement from_The_Magazine();

	@CssSelector("${pages.publications.latest_Physics_Jobs}")
	public AspireWebElement latest_Physics_Jobs();

	@CssSelector("${pages.publications.latest_Magazine_Issues}")
	public AspireWebElement latest_Magazine_Issues();

	@CssSelector("${pages.publications.most_Read}")
	public AspireWebElement most_Read();

	@CssSelector("${pages.publications.view_All_Jobs}")
	public AspireWebElement view_All_Jobs();

	@CssSelector("${pages.publications.most_Read_Article}")
	public AspireWebElement most_Read_Article();

	@CssSelector("${pages.publications.talked_About}")
	public AspireWebElement talked_About();

	@CssSelector("${pages.publications.most_Read_Articles}")
	public AspireWebElement most_Read_Articles();

	@CssSelector("${pages.publications.most_Read_Articles_Date}")
	public AspireWebElement most_Read_Articles_Date();

	@CssSelector("${pages.publications.talked_About_Articles}")
	public AspireWebElement talked_About_Articles();

	@CssSelector("${pages.publications.banner_Subscribe}")
	public AspireWebElement banner_Subscribe();

	@CssSelector("${pages.publications.left_Title}")
	public AspireWebElement left_Title();

	@CssSelector("${pages.publications.forAuthors}")
	public AspireWebElement forAuthors();

	@CssSelector("${pages.publications.applied_Physics_Letters}")
	public AspireWebElement applied_Physics_Letters();

	@CssSelector("${pages.publications.search_Text}")
	public AspireWebElement search_Text();

	@CssSelector("${pages.publications.searchIcon}")
	public AspireWebElement searchIcon();

	@CssSelector("${pages.publications.first_Search_Result}")
	public AspireWebElement first_Search_Result();

	@CssSelector("${pages.publications.full_Text}")
	public AspireWebElement full_Text();

	@CssSelector("${pages.publications.access_Message}")
	public AspireWebElement access_Message();

	@CssSelector("${pages.publications.access_Pdf}")
	public AspireWebElement access_Pdf();

	@CssSelector("${pages.publications.publication_Title}")
	public AspireWebElement publication_Title();

	@CssSelector("${pages.publications.shopping_Cart_Publication_Title}")
	public AspireWebElement shopping_Cart_Publication_Title();

	@CssSelector("${pages.publications.shopping_Cart}")
	public AspireWebElement shopping_Cart();

	@CssSelector("${pages.publications.checkout_Btn}")
	public AspireWebElement checkout_Btn();

	@CssSelector("${pages.publications.add_To_Cart_Btn}")
	public AspireWebElement add_To_Cart_Btn();

	@CssSelector("${pages.publications.price}")
	public AspireWebElement price();

	@CssSelector("${pages.publications.price_Number}")
	public AspireWebElement price_Number();

	@CssSelector("${pages.publications.billing_Information}")
	public AspireWebElement billing_Information();

	@CssSelector("${pages.publications.for_Authors_Advance}")
	public AspireWebElement for_Authors_Advance();

	@CssSelector("${pages.publications.preparing_Manuscript}")
	public AspireWebElement preparing_Manuscript();

	@CssSelector("${pages.publications.header_Title}")
	public AspireWebElement header_Title();

	@CssSelector("${pages.publications.publication_Charges}")
	public AspireWebElement publication_Charges();

	@CssSelector("${pages.publications.author_Resources}")
	public AspireWebElement author_Resources();

	@CssSelector("${pages.publications.author_Submit}")
	public AspireWebElement author_Submit();

	@CssSelector("${pages.publications.author_Resource_Title}")
	public AspireWebElement author_Resource_Title();

	@CssSelector("${pages.publications.submit_Aip_Advances}")
	public AspireWebElement submit_Aip_Advances();

	@CssSelector("${pages.publications.author_Instructions}")
	public AspireWebElement author_Instructions();

	@CssSelector("${pages.publications.microsoft_Word}")
	public AspireWebElement microsoft_Word();

	@CssSelector("${pages.publications.preparing_Graphics}")
	public AspireWebElement preparing_Graphics();

	@CssSelector("${pages.publications.publication_Charges_Option}")
	public AspireWebElement publication_Charges_Option();

	@CssSelector("${pages.publications.waiver_Policy}")
	public AspireWebElement waiver_Policy();

	@CssSelector("${pages.publications.apc_Refund_Policy}")
	public AspireWebElement apc_Refund_Policy();

	
	@CssSelector("${pages.publications.publishers_Featured}")
	public AspireWebElement publishers_Featured();

	@CssSelector("${pages.publications.publicationCoverImage}")
	public AspireWebElement publicationCoverImage();

	@CssSelector("${pages.publications.publishers_Publications}")
	public AspireWebElement publishers_Publications();

	@CssSelector("${pages.publications.about_Publishers}")
	public AspireWebElement about_Publishers();
	

	
	
	
}


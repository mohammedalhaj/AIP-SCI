package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "pytoday", url = "")
public interface PhysicsToday {

	@CssSelector("${pages.pytoday.physics_Today_Journal}")
	public AspireWebElement physics_Today_Journal();

	@CssSelector("${pages.pytoday.physics_Today_Image}")
	public AspireWebElement physics_Today_Image();

	@CssSelector("${pages.pytoday.physics_Today_Header}")
	public AspireWebElement physics_Today_Header();

	@CssSelector("${pages.pytoday.ad}")
	public AspireWebElement ad();

	@CssSelector("${pages.pytoday.aip_Publisher}")
	public AspireWebElement aip_Publisher();

	@CssSelector("${pages.pytoday.share_Section}")
	public AspireWebElement share_Section();

	@CssSelector("${pages.pytoday.subscribe}")
	public AspireWebElement subscribe();

	@CssSelector("${pages.pytoday.share_Fb_Pt}")
	public AspireWebElement share_Fb_Pt();

	@CssSelector("${pages.pytoday.share_Twitter_Pt}")
	public AspireWebElement share_Twitter_Pt();

	@CssSelector("${pages.pytoday.rss}")
	public AspireWebElement rss();

	@CssSelector("${pages.pytoday.rss_Page}")
	public AspireWebElement rss_Page();

	@CssSelector("${pages.pytoday.signUpForAlerts}")
	public AspireWebElement signUpForAlerts();

	@CssSelector("${pages.pytoday.journal_Tabs}")
	public AspireWebElement journal_Tabs();

	@CssSelector("${pages.pytoday.physics_Today_Subscribe_Btn}")
	public AspireWebElement physics_Today_Subscribe_Btn();

	@CssSelector("${pages.pytoday.physics_Today_Subscribe_Page}")
	public AspireWebElement physics_Today_Subscribe_Page();

	@CssSelector("${pages.pytoday.physics_Today_Home}")
	public AspireWebElement physics_Today_Home();

	@CssSelector("${pages.pytoday.physics_Today_Browse}")
	public AspireWebElement physics_Today_Browse();

	@CssSelector("${pages.pytoday.physics_Today_Info}")
	public AspireWebElement physics_Today_Info();

	@CssSelector("${pages.pytoday.physics_Today_Jobs}")
	public AspireWebElement physics_Today_Jobs();

	@CssSelector("${pages.pytoday.physics_Today_Signup_Alerts}")
	public AspireWebElement physics_Today_Signup_Alerts();

	@CssSelector("${pages.pytoday.journal_Alerts_Page}")
	public AspireWebElement journal_Alerts_Page();

	@CssSelector("${pages.pytoday.most_Recent_Image1}")
	public AspireWebElement most_Recent_Image1();

	@CssSelector("${pages.pytoday.most_Recent_Image2}")
	public AspireWebElement most_Recent_Image2();

	@CssSelector("${pages.pytoday.most_Recent_Image3}")
	public AspireWebElement most_Recent_Image3();

	@CssSelector("${pages.pytoday.most_Recent_Image4}")
	public AspireWebElement most_Recent_Image4();

	@CssSelector("${pages.pytoday.most_Recent_Image5}")
	public AspireWebElement most_Recent_Image5();

	@CssSelector("${pages.pytoday.most_Recent_Image6}")
	public AspireWebElement most_Recent_Image6();

	@CssSelector("${pages.pytoday.magazine_See_More}")
	public AspireWebElement magazine_See_More();

	@CssSelector("${pages.pytoday.magazine_Image1}")
	public AspireWebElement magazine_Image1();

	@CssSelector("${pages.pytoday.magazine_Image2}")
	public AspireWebElement magazine_Image2();

	@CssSelector("${pages.pytoday.magazine_Image3}")
	public AspireWebElement magazine_Image3();

	@CssSelector("${pages.pytoday.magazine_Image4}")
	public AspireWebElement magazine_Image4();

	@CssSelector("${pages.pytoday.magazineSeeMore}")
	public AspireWebElement magazineSeeMore();

	@CssSelector("${pages.pytoday.latest_Magazine_See_More}")
	public AspireWebElement latest_Magazine_See_More();

	@CssSelector("${pages.pytoday.latest_Image1}")
	public AspireWebElement latest_Image1();

	@CssSelector("${pages.pytoday.latest_Image2}")
	public AspireWebElement latest_Image2();

	@CssSelector("${pages.pytoday.latest_Image3}")
	public AspireWebElement latest_Image3();

	@CssSelector("${pages.pytoday.latest_Image4}")
	public AspireWebElement latest_Image4();

	@CssSelector("${pages.pytoday.latest_Image5}")
	public AspireWebElement latest_Image5();

	@CssSelector("${pages.pytoday.latest_Image6}")
	public AspireWebElement latest_Image6();

	@CssSelector("${pages.pytoday.latest_Image7}")
	public AspireWebElement latest_Image7();

	@CssSelector("${pages.pytoday.most_Recent_See_More}")
	public AspireWebElement most_Recent_See_More();

	@CssSelector("${pages.pytoday.all_Departments}")
	public AspireWebElement all_Departments();

	@CssSelector("${pages.pytoday.latest_Issues_Page}")
	public AspireWebElement latest_Issues_Page();

	@CssSelector("${pages.pytoday.physicsTodayAdFrame}")
	public AspireWebElement physicsTodayAdFrame();

	@CssSelector("${pages.pytoday.first_Ad_Right}")
	public AspireWebElement first_Ad_Right();

	@CssSelector("${pages.pytoday.second_Ad_Right}")
	public AspireWebElement second_Ad_Right();

	@CssSelector("${pages.pytoday.secondFrame}")
	public AspireWebElement secondFrame();

	@CssSelector("${pages.pytoday.published_Date}")
	public AspireWebElement published_Date();

	@CssSelector("${pages.pytoday.physics_Today_Home_Title}")
	public AspireWebElement physics_Today_Home_Title();

	@CssSelector("${pages.pytoday.most_Recent_Online_Stories}")
	public AspireWebElement most_Recent_Online_Stories();

	@CssSelector("${pages.pytoday.from_The_Magazine}")
	public AspireWebElement from_The_Magazine();

	@CssSelector("${pages.pytoday.latest_Physics_Jobs}")
	public AspireWebElement latest_Physics_Jobs();

	@CssSelector("${pages.pytoday.latest_Magazine_Issues}")
	public AspireWebElement latest_Magazine_Issues();

	@CssSelector("${pages.pytoday.most_Read}")
	public AspireWebElement most_Read();

	@CssSelector("${pages.pytoday.view_All_Jobs}")
	public AspireWebElement view_All_Jobs();

	@CssSelector("${pages.pytoday.most_Read_Article}")
	public AspireWebElement most_Read_Article();

	@CssSelector("${pages.pytoday.talked_About}")
	public AspireWebElement talked_About();

	@CssSelector("${pages.pytoday.most_Read_Articles}")
	public AspireWebElement most_Read_Articles();

	@CssSelector("${pages.pytoday.most_Read_Articles_Date}")
	public AspireWebElement most_Read_Articles_Date();
	
	@CssSelector("${pages.pytoday.talked_About_Articles}")
	public AspireWebElement talked_About_Articles();
	
	@CssSelector("${pages.pytoday.banner_Subscribe}")
	public AspireWebElement banner_Subscribe();
	
	@CssSelector("${pages.pytoday.left_Title}")
	public AspireWebElement left_Title();
	
}
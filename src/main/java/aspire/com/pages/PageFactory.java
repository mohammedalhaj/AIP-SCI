package aspire.com.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jo.aspire.automation.logger.EnvirommentManager;

/**
 * PageFactory that is used to instantiate desired page object
 */

public class PageFactory {

	private WebDriverProvider webDriverProvider;

	public PageFactory(WebDriverProvider webDriverProvider) {
		EnvirommentManager.setInitialClass(this.getClass());
		this.webDriverProvider = webDriverProvider;
	}

	public WebDriverProvider getDriverProvider() {
		return webDriverProvider;
	}

	public StepsPage newSteps() {
		return new StepsPage(webDriverProvider);
	}

	public GenericPage genericPage() {
		return new GenericPage(webDriverProvider);
	}

	public EventsPage eventPage() {
		return new EventsPage(webDriverProvider);
	}

	public SearchPage SearchPage() {
		return new SearchPage(webDriverProvider);
	}

	public BlogPage blogPage() {
		return new BlogPage(webDriverProvider);
	}
	
	public ScitationPage newSitationSteps() {
		return new ScitationPage(webDriverProvider);
	}

}

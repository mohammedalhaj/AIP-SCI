package aspire.com.steps;

import aspire.com.pages.StepsPage;
import jo.aspire.generic.SoftAssert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import aspire.com.pages.BlogPage;
import aspire.com.pages.EventsPage;
import aspire.com.pages.GenericPage;
import aspire.com.pages.PageFactory;
import aspire.com.pages.SearchPage;
import aspire.com.pages.ScitationPage;

@ContextConfiguration(
// "classpath:/aspire/com/steps/cucumber.xml"
"file:cucumber.xml")
public class BaseSteps {

	@Autowired
	PageFactory pageFactory = null;
	private StepsPage steps;
	private GenericPage genericSteps;
	private EventsPage eventPage;
	private SearchPage searchPage;
	private BlogPage blogPage;
	private ScitationPage Scitation;
	
	public BaseSteps() {

	}

	public BaseSteps(PageFactory pageFactory) {
		this.pageFactory = pageFactory;

	}

	public StepsPage getStepsPage() {
		if (steps == null) {
			steps = pageFactory.newSteps();
		}
		return steps;

	}

	public GenericPage getGenericPage() {
		if (genericSteps == null) {
			genericSteps = pageFactory.genericPage();
		}
		return genericSteps;

	}

	public EventsPage getEventPage() {
		if (eventPage == null) {
			eventPage = pageFactory.eventPage();
		}
		return eventPage;

	}

	public SearchPage getSearchPage() {
		if (searchPage == null) {
			searchPage = pageFactory.SearchPage();
		}
		return searchPage;

	}

	public BlogPage getBlogPage() {
		if (blogPage == null) {
			blogPage = pageFactory.blogPage();
		}
		return blogPage;

	}
	
	public ScitationPage getScitationPage()
	{
		if(Scitation == null){
			Scitation = pageFactory.newSitationSteps();
		}
		return Scitation;
		
	}

}

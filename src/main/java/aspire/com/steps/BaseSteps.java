package aspire.com.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import aspire.com.pages.DattoPage;
import aspire.com.pages.GenericPage;
import aspire.com.pages.PageFactory;
import aspire.com.pages.StepsPage;

@ContextConfiguration(
// "classpath:/aspire/com/steps/cucumber.xml"
"file:cucumber.xml")
public class BaseSteps {

	@Autowired
	PageFactory pageFactory = null;
	private StepsPage steps;
	private GenericPage genericSteps;
	private DattoPage dattoPage;

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

	public DattoPage getDattoPage() {
		if (dattoPage == null) {
			dattoPage = pageFactory.dattoPage();
		}
		return dattoPage;

	}

}

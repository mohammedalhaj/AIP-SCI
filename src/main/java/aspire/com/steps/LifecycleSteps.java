package aspire.com.steps;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.ScenarioType;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;

import com.aspire.automationReport.AspireReport;
import com.aspire.automationReport.ReportDataManager;

import aspire.com.pages.PageFactory;
import cucumber.api.java.Before;
import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.generic.GenericHelper;
import jo.aspire.generic.StateHelper;

public class LifecycleSteps {
	@Autowired
	private PageFactory pageFactory = null;

	public LifecycleSteps() {
	}

	public LifecycleSteps(PageFactory pageFactory) {
		this.pageFactory = pageFactory;
	}

	@BeforeStories
	public void runBeforeAllStories() {
		try {
			// do something
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	@BeforeStory
	public void runBeforeEachStory() {
		try {

			ReportDataManager.getInstance().setCurrentStoryStartDate();
			// do somthing
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	@Before
	public void beforeCucmberScenario() {

		pageFactory.getDriverProvider().initialize();
	}

	@AfterStory
	public void runAfterEachStory() {
		try {

			StateHelper.clearStoryState();

			ReportDataManager.getInstance().setCurrentStoryEndDate();

			AspireReport.getInstance().printEveryThing();
			// AspireReport.getInstance().allowWriteOnDatabase();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	@cucumber.api.java.After
	public void afterCucmberScenario() {
		pageFactory.getDriverProvider().end();
	}

	@AfterStories
	public void runAfterStories() throws IOException {

		StateHelper.clearStoryState();
		try {
			AspireReport.getInstance().printEveryThing();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}

		// StoriesStatusCounter storiesStatusCounter =
		// ReportDataManager.getInstance().getTestCounters();

		// int passedTestCount = storiesStatusCounter.getPassed();
		// int failedTestCount = storiesStatusCounter.getFailed();
		// int skippedTestCount = storiesStatusCounter.getSkipped();
		int passedTestCount = ReportDataManager.getInstance().getPassedScenariosCount();
		int failedTestCount = ReportDataManager.getInstance().getFailedScenariosCount();
		int skippedTestCount = ReportDataManager.getInstance().getSkippedScenaiosCount();
		int totalTestCount = passedTestCount + failedTestCount + skippedTestCount;
		ReportDataManager.getInstance();
		PrintWriter writer = new PrintWriter(
				ReportDataManager.getReportPath() + File.separator + "High_Level_Results.txt", "UTF-8");
		writer.println("tc_ran =  " + totalTestCount);
		writer.println("tc_passed = " + passedTestCount);
		writer.println("tc_failed = " + failedTestCount);
		writer.println("tc_skipped = " + skippedTestCount);
		writer.close();

		if (EnvirommentManager.getInstance().getProperty("sendEmailWithAttachments").equals("true")) {
			ReportDataManager.getInstance();
			GenericHelper.sendEmailWithAttachments(

					EnvirommentManager.getInstance().getProperty("email_attachmentExtension"),
					ReportDataManager.getReportPath());
		}
	}

	@AfterScenario(uponType = ScenarioType.EXAMPLE)
	public void runAfterEachScenario1() {
		ReportDataManager.getInstance().setCurrentScenarioEndDate();
		AspireReport.getInstance().printEveryThing();
	}

	@BeforeScenario(uponType = ScenarioType.EXAMPLE)
	public void beforeEachExampleScenario() {

		ReportDataManager.getInstance().setCurrentScenarioStartDate();
	}

	@AfterScenario
	public void runAfterEachScenario() {
		ReportDataManager.getInstance().setCurrentScenarioEndDate();

		AspireReport.getInstance().printEveryThing();

		StateHelper.clearScenarioState();
		boolean isRunOnSauce = Boolean.parseBoolean(EnvirommentManager.getInstance().getProperty("useSouceLabs"));
		if (!isRunOnSauce) {
			deleteAllCookies();
		}

	}

	@BeforeScenario
	public void runBeforeEachScenario() {
		ReportDataManager.getInstance().setCurrentScenarioStartDate();
		StateHelper.clearScenarioState();
		boolean isRunOnSauce = Boolean.parseBoolean(EnvirommentManager.getInstance().getProperty("useSouceLabs"));
		if (!isRunOnSauce) {
			deleteAllCookies();
		}

	}

	public void deleteAllCookies() {
	}

}

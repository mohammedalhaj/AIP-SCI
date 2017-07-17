/**
 * 
 */
package aspire.com.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;

import com.aspire.automationReport.CustomScenario;
import com.aspire.automationReport.CustomStep;
import com.aspire.automationReport.CustomStory;
import com.aspire.automationReport.ExpectedResult;
import com.aspire.automationReport.ReportDataManager;
import com.aspire.automationReport.data.DashboardApiHandler;
import com.aspire.automationReport.util.DateUtil;

/**
 * @author aabusharar
 *
 */
public class SkippedStoriesHandler {

	private static DashboardApiHandler dashboardApiHandler = DashboardApiHandler.instance;

	/**
	 * 
	 * @param story
	 * @param result
	 * @param runId
	 * @param isCurrentRunning
	 * @return
	 */
	public static CustomStory createCustomStory(Story story, ExpectedResult result, long runId,
			boolean isCurrentRunning) {
		CustomStory customStory = new CustomStory();
		Calendar cuurent = Calendar.getInstance();
		customStory.setStory(story);
		customStory.setCurrentlyRunning(isCurrentRunning);
		customStory.setStartDate(cuurent.getTime());
		customStory.setStatus(result);
		customStory.setExecutionDate(DateUtil.dateToString(customStory.getStartDate()));
		cuurent.add(Calendar.MINUTE, 2);
		customStory.setEndDate(cuurent.getTime());
		customStory.setRunId(runId);

		return customStory;
	}

	/**
	 * 
	 * @param scenario
	 * @param result
	 * @param isCurrentRunning
	 * @return
	 */
	public static CustomScenario createCustomScenario(Scenario scenario, ExpectedResult result,
			boolean isCurrentRunning, Long storyId) {
		CustomScenario customScenario = new CustomScenario();
		// Calendar cuurent = Calendar.getInstance();
		customScenario.setStartDate(new Date());
		customScenario.setScenario(scenario);
		customScenario.setCurrentlyRunning(isCurrentRunning);
		customScenario.setEndDate(new Date());
		customScenario.setStatus(result);
		customScenario.setStoryID(storyId);
		return customScenario;
	}

	/**
	 * 
	 * @param step
	 * @param result
	 * @return
	 */
	public static CustomStep createCustomStep(String step, ExpectedResult result, Long scenarioId) {
		// Calendar cuurent = Calendar.getInstance();
		CustomStep customStep = new CustomStep();
		customStep.setStartDate(new Date());
		customStep.setStatus(ExpectedResult.skipped);
		customStep.setStep(step);
		// cuurent.add(Calendar.MINUTE, 2);
		customStep.setEndDate(new Date());
		customStep.setScenarioID(scenarioId);
		return customStep;
	}

	/**
	 * 
	 * @param skkipedStory
	 * @param skippedScenarios
	 * @param runId
	 */
	public static void addSkippedStory(Story skkipedStory, List<Scenario> skippedScenarios, long runId) {
		ExpectedResult result = ExpectedResult.skipped;
		boolean isCurrentRunning = false;
		CustomStory customStory = createCustomStory(skkipedStory, result, runId, isCurrentRunning);
		ArrayList<CustomScenario> customScenarios = new ArrayList<>();
		ArrayList<CustomStep> customSteps = new ArrayList<>();
		dashboardApiHandler.addStory(customStory);
		for (Scenario scenario : skippedScenarios) {
			System.out.println("Ahmad Test --> {" + "Name: " + scenario.getTitle() + " , Meta: "
					+ scenario.getMeta().toString() + " , StatusId: " + ExpectedResult.skipped + " , StartDate: "
					+ Calendar.getInstance().getTime() + " , EndDate :" + null + " , ExecutionTime: " + null + "}");

			CustomScenario customScenario = createCustomScenario(scenario, result, isCurrentRunning,
					customStory.getId());
			dashboardApiHandler.addScenario(customScenario);
			int stepSeq = 0;
			for (String stepValue : scenario.getSteps()) {
				System.out.println(customScenario.getId());
				CustomStep step = createCustomStep(stepValue, result, customScenario.getId());
				step.setStepSequence(stepSeq);
				stepSeq++;
				dashboardApiHandler.addSteps(step);
				customSteps.add(step);
			}

			customScenario.setAllSteps(customSteps);
			dashboardApiHandler.updateStory(customStory);
			customScenarios.add(customScenario);
		}

		customStory.setScenarios(customScenarios);
		ReportDataManager.getInstance().setSkippedScenaiosCount(
				ReportDataManager.getInstance().getSkippedScenaiosCount() + customScenarios.size());
		ReportDataManager.getInstance()
				.setScenariosCount(ReportDataManager.getInstance().getScenariosCount() + customScenarios.size());
		customStory.setSkippedScenariosCount(customStory.getSkippedScenariosCount() + customScenarios.size());
		customStory.setNumberOfScenarios(customStory.getNumberOfScenarios() + customScenarios.size());
		dashboardApiHandler.updateStory(customStory);
		dashboardApiHandler.updateRun();

	}



}

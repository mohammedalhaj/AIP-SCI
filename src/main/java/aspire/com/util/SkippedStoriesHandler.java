/**
 * 
 */
package aspire.com.util;

import java.util.ArrayList;
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

	private static DashboardApiHandler dashboardApiHandler = DashboardApiHandler.getInstance();

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
		customStory.setStory(story);
		customStory.setCurrentlyRunning(isCurrentRunning);
		customStory.setStartDate(DateUtil.getDateByUTCZone());
		customStory.setStatus(result);
		customStory.setExecutionDate(DateUtil.dateToString(customStory.getStartDate()));
		customStory.setEndDate(DateUtil.getDateByUTCZone());
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
		customScenario.setStartDate(DateUtil.getDateByUTCZone());
		customScenario.setScenario(scenario);
		customScenario.setCurrentlyRunning(isCurrentRunning);
		customScenario.setEndDate(DateUtil.getDateByUTCZone());
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
		CustomStep customStep = new CustomStep();
		customStep.setStartDate(DateUtil.getDateByUTCZone());
		customStep.setStatus(ExpectedResult.skipped);
		customStep.setStep(step);
		customStep.setEndDate(DateUtil.getDateByUTCZone());
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

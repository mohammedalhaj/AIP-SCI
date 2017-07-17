package aspire.com.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.seleniumhq.selenium.fluent.Period.secs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.jbehave.web.selenium.WebDriverProvider;
import org.mockserver.model.HttpRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;

import jo.aspire.automation.logger.AspireLog4j;
import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.automation.logger.Log4jLevels;
import jo.aspire.generic.MockServerProxy;
import jo.aspire.generic.StateHelper;
import jo.aspire.web.automationUtil.BrowserAlertHelper;
import jo.aspire.web.automationUtil.DriverProvider;

/**
 * Page object defining the home page
 */
public class StepsPage extends GenericPage {
	public Connection con;
	BrowserAlertHelper test = new BrowserAlertHelper();

	public StepsPage(WebDriverProvider driverProvider) {
		super(driverProvider);

		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Selector within the class
	 */
	private By Version = cssSelector("td.mh22-text a");
	private final int CONST_WAIT_LOWER_VALUE = 30;

	public FluentWebElement getWorkSmartVersion() {
		return within(secs(CONST_WAIT_LOWER_VALUE)).link(Version);
	}

	public String checkVersinoTextFromHeader() {
		return getWorkSmartVersion().getText().toString();
	}

	public void go()  {
		get("http://aspire.jo/");
		getDriverProvider().get().manage().window().maximize();

	}


	public void goFF()  {


		DriverProvider dp = new DriverProvider();

		WebDriver webd = dp.initialize("chrome");

		webd.get("https://www.mkyong.com/");

		System.out.println("INSIDE NEW WEB DRIVER ");
		sleepTime(5000);
		webd.close();
		get("http://aspire.jo/");
		getDriverProvider().get().manage().window().maximize();
		sleepTime(5000);

	}

	public void go2kargo()  {
		getDriverProvider().get().manage().deleteAllCookies();

		get("https://marketplace.staging.kargo.com/");
		getDriverProvider().get().manage().window().setSize(new Dimension(1456, 876));

	}

	public void login2KargoSitelist()  {
		sleepTime(2000);
		get("https://marketplace.staging.kargo.com/advertising/site-lists#/mine");
		sleepTime(3000);
	}

	public void goAspire()  {
		get("http://google.jo/");

	}

	public void navigateTo(String page)  {
		get(EnvirommentManager.getInstance().getProperty(page));

	}

	public boolean isJavascriptEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyNetworkData() {
		System.out.println("------------- start ---------");
		System.out.println(
				MockServerProxy.proxy.retrieveAsJSON(HttpRequest.request().withHeader("Host", "www.aspire.jo")));
		System.out.println("------------- end ---------");
	}

	public boolean dbOpenConn() throws ClassNotFoundException  {

		Class.forName("com.mysql.jdbc.Driver");
		try {
			// Create Connection to DB
			con = DriverManager.getConnection("jdbc:mysql://172.17.100.33/AUTOMATION_DASHBOARD", "roott", "root");
			System.err.println("CONNECT TO DATABASE");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.err.println("ERROR!!! Cannot connect");
			return false;
		}

		return true;
	}

	public boolean testLogger() throws ClassNotFoundException, SQLException {
		// System.err.println("getval1 f= " +
		// StateHelper.getStoryState("testMyVal"));
		ArrayList<String> rowList = new ArrayList<String>();
		dbOpenConn();
		try {
			// Create Statement Object
			System.err.println("error ---- " + con);
			Statement stmt = con.createStatement();
			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM AUTOMATION_DASHBOARD.LOGS limit 1");
			System.err.println("res" + rs);
			System.err.println("Executing the query please wait ...");
			ResultSetMetaData rsmd = null;
			rsmd = (ResultSetMetaData) rs.getMetaData();
			int columnsCount = rsmd.getColumnCount();

			for (int j = 1; j <= columnsCount; j++) {
				System.err.print(rsmd.getColumnName(j) + " || ");
			}
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			// While Loop to iterate through all data and print results
			rowList.clear();
			while (rs.next()) {
				for (int i = 1; i <= columnsCount; i++) {
					String Data = rs.getString(i).trim();
					rowList.add(Data.toLowerCase());
					// System.err.print(Data + " || ");
				}
				System.out.print("\n");
			}
			// if (rowList == null) {}
			if (rowList.size() == 0) {
				rowList.add("empty");
				con.close();
				// return rowList;
			} else {
				con.close();
				// return rowList;
			}
		}

		catch (Exception e) {
			AspireLog4j.setLoggerMessageLevel("\n DB error ", Log4jLevels.INFO, e);
			e.printStackTrace();
			// System.err.println("ERROR!!! Please check the query statement");
			con.close();
			// return null;
		}

		return false;

	}

	public void fillUN() {

		StateHelper.setScenarioState("testMyVal", "firstVal");
		StateHelper.setStoryState("2ndKey", "2ndVal");
		sleepTime(5000);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("UNLocater")))
				.sendKeys(EnvirommentManager.getInstance().getProperty("UNVal"));
		// StateHelper.clearScenarioState();
		// if (System.getProperty("stackBrowserName") == null) {
		// PlatformInformation.browserName =
		// EnvirommentManager.getInstance().getProperty("stackBrowserName");
		// } else {
		// PlatformInformation.browserName =
		// System.getProperty("stackBrowserName");
		// }
		System.err.println("getval1 t= " + StateHelper.getScenarioState("testMyVal"));
		System.err.println("get2ndVal t = " + StateHelper.getStoryState("2ndKey"));
		// System.err.println("getval1 f= " +
		// StateHelper.checkScenarioStateContainsKey("testMyVal33"));
		// System.err.println("getval1 t= " +
		// StateHelper.checkScenarioStateContainsKey("testMyVal"));
	}

	public void fillPW() {
		System.err.println("get2ndVal t= " + StateHelper.getStoryState("2ndKey"));
		// System.err.println("getval1 f= " +
		// StateHelper.getScenarioState("testMyVal"));
		StateHelper.setApplicationState("AppKey", "AppVal");
		StateHelper.setApplicationState("AppKey2", "AppVal2");
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("PWLocater"))).sendKeys("K@rgo123!");
		sleepTime(3000);
	}

	public void getVal() {
		System.err.println("getApp val t= " + StateHelper.getApplicationState("AppKey"));
		System.err.println("getApp val t= " + StateHelper.getApplicationState("AppKey2"));
		System.err.println("get2ndVal from another story= " + StateHelper.getStoryState("2ndKey"));
	}

	public void alert() {
		sleepTime(7000);
		clickOnElement("Close");
		sleepTime(4000);
		boolean x1 = test.isDialogPresent(getDriverProvider().get());
		String val = test.getBrowserAlertText(getDriverProvider().get());
		test.declineBrowserAlert(getDriverProvider().get());
		sleepTime(5000);
		System.out.println("my data = " + x1 + val);
	}

}
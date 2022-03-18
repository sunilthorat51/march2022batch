package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import methods.HTMLReportGenerator;


public class Hookable
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException 
	{
		HTMLReportGenerator.TestSuiteStart("E:\\AutomationTesting\\Flipkart.html","FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("....................Scenario Starts..........................");
	}

	@After
	public void after(Scenario Scenarion)
	{
		System.out.println("....................Scenario Ends............................");
		
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
}
 
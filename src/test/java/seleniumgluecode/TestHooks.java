package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import listener.ExtentReportListener;
//import com.aventstack.extentreports.GherkinKeyword;
//import com.aventstack.extentreports.gherkin.model.Scenario;

public class TestHooks extends ExtentReportListener {
	
//	@Before
//	public void beforeScenario(Scenario scenario) {		
//		System.out.println("Started execution for the scenario : " + scenario.getName());
//		scenarioName = scenario.getName();
//		String[] rawFeatureName = ((scenario.getId().split("\\:")[0]).split("/"));
//		int len = rawFeatureName.length;
//		String FeatureName = rawFeatureName[len-1];
//		
////		System.out.println("changed to ---------"+FeatureName);
////		    if (!FeatureName.equalsIgnoreCase(Feature_Name)) {             //f_n = fast
////		    	test = extent.createTest(Feature.class, FeatureName);
////		    	Feature_Name = FeatureName;
////		    }
//		    
//		    //test=test.createNode((Class<? extends IGherkinFormatterModel>) Scenario.class,scenarioName);	
//		    //test = extent.createTest(Feature.class, FeatureName);		//FEATURE NAME				
//			//test=test.createNode((Class<? extends IGherkinFormatterModel>) Scenario.class, "Login as a authenticated user");			//SCENARIO NAME	
//		
//		
//	}
	
	@Before
	public void beforeScenario(Scenario scenario) {		
		System.out.println("Started execution for the scenario : " + scenario.getName());
		System.out.println("Started execution for the scenario : " + scenario.getName());
		scenarioName = scenario.getName();
		String[] rawFeatureName = ((scenario.getId().split("\\:")[0]).split("/"));
		int len = rawFeatureName.length;
		Feature_Name = rawFeatureName[len-1];
	}
	
	@Before("@TestCase2")
	public void beforeTestCase2(Scenario scenario) {		

		System.out.println("=========================================");
		System.out.println("Executing before Testcase2");
		System.out.println("=========================================");
		
	}
	
	@After
	public void AfterScenario(Scenario scenario) {
		System.out.println("Completed execution for the scenario :" + scenario.getName());
	}


}
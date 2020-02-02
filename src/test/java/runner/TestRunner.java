//package runner;
//
//import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},// Below to execute multiple different path
//monochrome = true, features = "src/test/java/feature/test.feature" //@Cucumber.Options(features = { "path.1_feature", "path.2_feature" },"
//,glue= {"seleniumgluecode"})
//
//
//
//public class TestRunner
//{
//}

package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.*;

@CucumberOptions (
        features = "src/test/java/feature/test.feature"
        ,glue = {"seleniumgluecode"}
        ,tags = {"@SmokeTest"}) 
		/*,plugin= { "pretty",
                "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },
        monochrome = true)*/
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {    	
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")    
    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
       // return testNGCucumberRunner.provideFeatures();    	
    	 return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}
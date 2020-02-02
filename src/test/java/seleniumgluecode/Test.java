package seleniumgluecode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import listener.ExtentReportListener;
import page.LoginPage;

public class Test extends ExtentReportListener {  //public class Test extends BaseTest

	//PropertiesFileReader obj= new PropertiesFileReader();
	//public static ExtentReports extent;
	//TestHooks TH = new TestHooks();
	
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
//			if (!Feature_Name.equalsIgnoreCase(Feature_Name_old)) {             //f_n = fast
//				test = extent.createTest(Feature.class, Feature_Name);		//FEATURE NAME		
//				Feature_Name_old = Feature_Name;
//			}
			test = extent.createTest(Feature.class, Feature_Name);		//FEATURE NAME					
			test=test.createNode(Scenario.class,scenarioName);			//SCENARIO NAME	
			
			logInfo=test.createNode(new GherkinKeyword("Given"), "user_is_on_homepage"); //GIVEN STEP NAME
			init("chrome");
			OpenURL("http://automationpractice.com/index.php");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("When"), "user_navigates_to_Login_Page"); //GIVEN STEP NAME
			LoginPage loginPage = new LoginPage(driver) ;
			PageFactory.initElements(driver,loginPage);
			loginPage.NavigateToLogin();
			logInfo.pass("user navigates to Login Page");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}	
	}

	@When("^user enters username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_Password_as(String username, String password) throws Throwable {
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("When"), "user_enters_username_as_and_Password_as"); //GIVEN STEP NAME
			LoginPage loginPage = new LoginPage(driver) ;
			PageFactory.initElements(driver,loginPage);
			loginPage.login(username, password);
			logInfo.pass("Logged in with User Name = "+username+ "  and Password = "+password);
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}
		
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("Then"), "success_message_is_displayed"); //GIVEN STEP NAME
			Assert.assertEquals(" Logout exists---so Login successful ", true, driver.findElement(By.xpath("//a[@class=\"logout\"]")).isDisplayed());
		    System.out.println("Login successful");
		    Thread.sleep(3000);
		    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);
		}
	}
	
	@When("^Click on My WishLists$")
	public void Click_on_My_WishLists() throws Throwable {
		
		
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("When"), "Click_on_My_WishLists"); //GIVEN STEP NAME
		
			driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]")).click();
			System.out.println("My wishlist clicked");
			
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}	
		
		
		

	}
	
	@When("^Click on My Addresses$")
	public void Click_on_My_addresses() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("When"), "Click_on_My_addresses"); //GIVEN STEP NAME
		
			driver.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();
			System.out.println("My addresses clicked");
			
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}
		
		

	}
	
	@Then("^LogoutApplication$")
	public void LogoutApplication() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
//			test = extent.createTest(Feature.class, "Login Feature");		//FEATURE NAME					
//			test=test.createNode(Scenario.class, "Login as a authenticated user");			//SCENARIO NAME			
			logInfo=test.createNode(new GherkinKeyword("Then"), "LogoutApplication"); //GIVEN STEP NAME
		
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			logInfo.info("Screenshot added");
			driver.close();
			System.out.println("Application logged out");
			
		} catch (AssertionError | Exception e) {
			System.out.println(e);
			testStepHandle("FAIL",driver,logInfo,e);			
		}
		
		

	}
	
	@After
	public void AfterScenario(Scenario scenario) throws ClassNotFoundException {
		 
	}
	
	
	
}

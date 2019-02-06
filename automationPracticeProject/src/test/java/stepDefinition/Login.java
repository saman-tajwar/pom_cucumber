package stepDefinition;


import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import pages.HomePage;
import pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import support.CommonAction;

public class Login {

	WebDriver driver = Hooks.driver;
	Logger logger = LogManager.getLogger(Login.this);

	@Given ("^User launches website$")
	public void open_Firefox_And_Launch_Application() {

		logger.info("Starting Application \n");
		try {
			CommonAction.launchUrl();
		}
		catch(TimeoutException e) {
			logger.error("Error: Start Application call got timed out");
		}
		catch(Exception el) {
			logger.error("Error: Browser is unreachable");
			CommonAction.captureScreenshot();

		}
	}

	@When ("^User click on signin link$")
	public void signIn() {
		
		//In this code we are injecting dependency by constructor method
		LoginPage login_Page = new LoginPage(driver);

		login_Page.clickOnSigninLink();
	}

	@And ("^User provides \"([^\"]*)\" login credentials$")
	public void enter_Login_Credentials(String testScenario) {
		
		//In this code we are injecting dependency by constructor method
		LoginPage login_Page = new LoginPage(driver);
		List<String> credentials = null;

		try {
			if(testScenario.equalsIgnoreCase("valid")) {
				credentials = CommonAction.getTestData("TestLogin.validLogin");
			}
			else if (testScenario.equalsIgnoreCase("invalid"))
			{
				credentials = CommonAction.getTestData("TestLogin.invalidLogin");
			}
			String username = credentials.get(0);
			String password = credentials.get(1);
			login_Page.typeUsername(username);
			login_Page.typePassWord(password);
		}
		catch(NoSuchElementException nse) {
			logger.error("Error: Unable to find username or password elements on the Screen");	
			CommonAction.captureScreenshot();
		}
		catch(TimeoutException te) {
			logger.error("Error: Start Application call got timed out");
			CommonAction.captureScreenshot();
		}
		catch(NullPointerException e) {
			logger.error("Error: Null object was used");
		}
		catch(Exception el) {
			logger.error("Taking Screenshot for failure scenario");
			CommonAction.captureScreenshot();
		}

	}

	@And ("^User provides email address to create new account$")
	public void enter_email_NewAccount() {
		//In this code we are injecting dependency by constructor method
		LoginPage login_Page = new LoginPage(driver);

		try {
			int incrementText = new Random().nextInt(9999);
			String emailAddr = "new_"+incrementText+"@test.com";
			login_Page.type_New_Username(emailAddr);

		}
		catch(NoSuchElementException nse) {
			logger.error("Error: Unable to find email elements on the Screen");
			CommonAction.captureScreenshot();
		}
		catch(Exception el) {
			CommonAction.captureScreenshot();

		}

	}

	@Then ("^User click on create an account button$")
	public void click_NewAccount_Button_() {
		LoginPage login_Page = new LoginPage(driver);

		login_Page.clickOnCreateAccountButtn();

	}

	@And ("^User provides details for creating new user$")
	public void enter_NewUser_Details() {
		LoginPage login_Page = new LoginPage(driver);
		List<String> user_Details = CommonAction.getTestData("TestLogin.createUser");;

		try {
			login_Page.select_Title(user_Details.get(0));
			login_Page.type_firstName(user_Details.get(1));
			login_Page.type_lastName(user_Details.get(2));
			login_Page.typePassWord(user_Details.get(3));
			CommonAction.scrollDown();
			login_Page.select_day_DOB(user_Details.get(4));
			login_Page.select_month_DOB(user_Details.get(5));
			login_Page.select_year_DOB(user_Details.get(6));
			login_Page.type_Addr_Line1(user_Details.get(7));
			login_Page.type_Addr_City(user_Details.get(8));
			login_Page.select_Addr_State(user_Details.get(9));
			login_Page.type_Addr_ZipCode(user_Details.get(10));
			login_Page.type_Mobile(user_Details.get(11));
		}
		catch(NoSuchElementException nse) {
			logger.error("Error: Unable to find elements on the Screen");	
		}
		catch(Exception el) {
			CommonAction.captureScreenshot();

		}

	}

	@Then ("^User should be able to login successfully on Submit$")
	public void click_Submit_Button_Success() {
		LoginPage login_Page = new LoginPage(driver);
		try {
			HomePage home_page = login_Page.clickOnSigninButtn();
			if(!home_page.verifyPageHeading()) {
				logger.info("Taking Screenshot for failure scenario");
				CommonAction.captureScreenshot();
			}
			Assert.assertTrue("User Could Not Login", home_page.verifyPageHeading());
		}
		catch(ElementNotVisibleException env){
			logger.error("Error: Element is not visible on the Screen");
			CommonAction.captureScreenshot();
		}
		catch(Exception et) {
			logger.error("Error: Browser is unreachable");
			CommonAction.captureScreenshot();
			
		}
	}

	@Then ("^User should be able to create account successfully on clicking Register$")
	public void click_Reigster_Button() {
		LoginPage login_Page = new LoginPage(driver);
		try {
			HomePage home_page = login_Page.clickOnRegisterButtn();
			Assert.assertTrue("User Could Not Login", home_page.verifyPageHeading());
		}
		catch(ElementNotVisibleException env){
			logger.error("Error: Element is not visible on the Screen");
		}
		catch(UnreachableBrowserException ube){
			logger.error("Error: Browser is unreachable");

		}
		catch(Exception et) {
			logger.error("Error: Browser is unreachable");
			CommonAction.captureScreenshot();
			
		}
	}

	@Then ("^User should be able to see error message on Screen at Submit$")
	public void click_Submit_Button_Failure() {
		LoginPage login_Page = new LoginPage(driver);
		try {
			login_Page.clickOnSigninButtn();
			
			//If Assertion fails then screenshot will be taken for failed test step
			if(!CommonAction.isTextOnPagePresent("Authentication failed.")) {
				logger.info("Taking Screenshot for failure scenario");
				CommonAction.captureScreenshot();
			}
			Assert.assertTrue("User Could Not Login", CommonAction.isTextOnPagePresent("Authentication failed."));
		}
		catch(ElementNotVisibleException env){
			logger.error("Error: Element is not visible on the Screen");
		}
		catch(UnreachableBrowserException ube){
			logger.error("Error: Browser is unreachable");

		}
		catch(Exception et) {
			logger.error("Error: Browser is unreachable");
			CommonAction.captureScreenshot();
			
		}
	}

	@And ("^User captures screenshot and embeds in report$")
	public void capture_Screenshot() {
		
		//Takes Screenshot and saves test evidences in Screenshot folder
		CommonAction.captureTestEvidence(Hooks.scenario.getName());
		
		//Takes Screenshot and embeds in report
		CommonAction.captureScreenshot();
	}

}

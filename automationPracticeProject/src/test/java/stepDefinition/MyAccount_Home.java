package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class MyAccount_Home {
	
	WebDriver driver = Hooks.driver;
	Logger logger = LogManager.getLogger(MyAccount_Home.this);
	
	@Then ("^User Clicks on SignOut from MyAccount Home Page$")
	public void click_SignOut() {
		//In this code we are injecting dependency by constructor method
		HomePage home_Page = new HomePage(driver);
		try {
		LoginPage login_page = home_Page.clickSignOut();
		Assert.assertTrue("User Could Not Login", login_page.verifyPageHeading());
		}
		catch(NoSuchElementException e) {
			logger.error("Error: Unable to find username or password elements on the Screen");	
		}
	}

}

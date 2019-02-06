package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.CommonAction;

public class Hooks {

	public static WebDriver driver;
	public static Scenario scenario;

	@Before
	public void initializeTest() {
		//This is file declaration for iOS file system
		System.setProperty("webdriver.gecko.driver", "/Users/tajwars/Downloads/geckodriver");
		try {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//This dependency injection through setter function
			CommonAction.setDriver(driver);
		}
		catch(UnreachableBrowserException ube){
			ube.printStackTrace();
		}
	}

	@Before
	public void before(Scenario scenario) {
		Hooks.scenario = scenario;
	}

	@After
	public void tearDownTest() {

		/* Here Screenshots are taken only for passed scenarios
		 * For failed Scenarios Screenshots are taken in test steps itself */
		if(scenario.getStatus().equalsIgnoreCase("passed")) {
			scenario.embed(((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES), "image/png");
		}

		//Quitting Current Driver Instance of test scenario
		driver.quit();
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver curr_driver) {
		//Initializing local driver to the driver received from page factory
		this.driver = curr_driver;
		PageFactory.initElements(curr_driver, this);
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="logout") 
	private WebElement logout_Link;

	@FindBy(how=How.CLASS_NAME,using="page-heading") 
	private WebElement pageHeading;
	
	public Boolean verifyPageHeading() {
		return (pageHeading.getText().equalsIgnoreCase("My account"));
	}
	
	public LoginPage clickSignOut() {
		logout_Link.click();
		LoginPage login_Page = new LoginPage(driver);
		return login_Page;
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;

	/*This constructor is creating driver instance and initialize elements*/
	public LoginPage(WebDriver curr_driver) {

		//Initializing local driver to the driver received
		this.driver = curr_driver;
		PageFactory.initElements(curr_driver, this);

	}

	/* All the weblEments are declared private incorporating data encapsulation property.
	 Methods present in this class will only be able to perform actions on these WebElements */

	@FindBy(how=How.CLASS_NAME,using="login") 
	private WebElement signIn_Link;

	@FindBy(id="email") 
	private WebElement userName_textBox;

	@FindBy(id="passwd") 
	private WebElement passWord_textBox;

	@FindBy(id="SubmitLogin") 
	private WebElement singin_Buttn;
	
	@FindBy(id="SubmitCreate") 
	private WebElement createAccount_Buttn;
	
	@FindBy(id="email_create") 
	private WebElement email_create_textBox;
	
	@FindBy(id="uniform-id_gender1") 
	private WebElement male_radio_Buttn;
	
	@FindBy(id="uniform-id_gender2") 
	private WebElement female_radio_Buttn;
	
	@FindBy(id="customer_firstname") 
	private WebElement first_name_textBox;
	
	@FindBy(id="customer_lastname") 
	private WebElement last_name_textBox;
	
	@FindBy(id="days") 
	private WebElement days_DOB_dropDown;
	
	@FindBy(id="months") 
	private WebElement months_DOB_dropDown;
	
	@FindBy(id="years") 
	private WebElement years_DOB_dropDown;
	
	@FindBy(how=How.CLASS_NAME,using="page-heading") 
	private WebElement pageHeading;
	
	@FindBy(id="firstname") 
	private WebElement firstname_addr_textBox;
	
	@FindBy(id="lastname") 
	private WebElement lastname_addr_textBox;
	
	@FindBy(id="address1") 
	private WebElement addrLine1_textBox;
	
	@FindBy(id="city") 
	private WebElement addrCity_textBox;

	@FindBy(id="id_state") 
	private WebElement addr_State_dropDown;
	
	@FindBy(id="postcode") 
	private WebElement addrPostcode_textBox;
	
	@FindBy(id="uniform-id_country") 
	private WebElement addr_Country_dropDown;
	
	@FindBy(id="phone_mobile") 
	private WebElement phone_mobile_textBox;

	public void clickOnSigninLink(){
		signIn_Link.click();
	}
	
	@FindBy(id="submitAccount") 
	private WebElement submitAccount_Buttn;

	
	public void typeUsername(String emailAddr) {
		userName_textBox.clear();
		userName_textBox.sendKeys(emailAddr);
	}

	public void typePassWord(String passWord) {
		passWord_textBox.clear();
		passWord_textBox.sendKeys(passWord);
	}

	public HomePage clickOnSigninButtn(){
		singin_Buttn.click();
		HomePage home_Page = new HomePage(driver);
		return home_Page;
	}
	
	public void clickOnCreateAccountButtn(){
		createAccount_Buttn.click();
	}
	
	public void type_New_Username(String emailAddr) {
		email_create_textBox.clear();
		email_create_textBox.sendKeys(emailAddr);
	}
	
	public void select_Title(String title) {
		if(title.equalsIgnoreCase("male")) {
			male_radio_Buttn.click();
		}
		else if(title.equalsIgnoreCase("female")) {
			female_radio_Buttn.click();
		}
	}
	
	public void type_firstName(String firstName) {
		first_name_textBox.clear();
		first_name_textBox.sendKeys(firstName);
	}
	
	public void type_lastName(String lastName) {
		last_name_textBox.clear();
		last_name_textBox.sendKeys(lastName);
	}

	public void select_day_DOB(String day_DOB) {
		Select dayList = new Select(days_DOB_dropDown);
		dayList.selectByValue(day_DOB);
	}
	
	public void select_month_DOB(String month_DOB) {
		Select monthList = new Select(months_DOB_dropDown);
		monthList.selectByValue(month_DOB);
	}
	
	public void select_year_DOB(String year_DOB) {
		Select yearList = new Select(years_DOB_dropDown);
		yearList.selectByValue(year_DOB);
	}
	
	public void type_New_PassWord(String passWord) {
		passWord_textBox.clear();
		passWord_textBox.sendKeys(passWord);
	}
	
	public void type_Addr_Line1(String addrLine1) {
		addrLine1_textBox.clear();
		addrLine1_textBox.sendKeys(addrLine1);
	}
	
	public void type_Addr_City(String addrCity) {
		addrCity_textBox.clear();
		addrCity_textBox.sendKeys(addrCity);
	}
	
	public void select_Addr_State(String addrState) {
		Select stateDropdown = new Select(addr_State_dropDown);
		stateDropdown.selectByValue(addrState);
	}
	
	public void type_Addr_ZipCode(String addrZip) {
		addrPostcode_textBox.clear();
		addrPostcode_textBox.sendKeys(addrZip);
	}
	
	public void type_Mobile(String mobilePhone) {
		phone_mobile_textBox.clear();
		phone_mobile_textBox.sendKeys(mobilePhone);
	}

	public HomePage clickOnRegisterButtn(){
		submitAccount_Buttn.click();
		HomePage home_Page = new HomePage(driver);
		return home_Page;
	}
	
	public Boolean verifyPageHeading() {
		return (pageHeading.getText().equalsIgnoreCase("Authentication"));
	}

}

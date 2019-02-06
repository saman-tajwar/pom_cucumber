Feature: Test Login Functionality for automationPractice site

Scenario: Registered_user_login_with_valid_credentials

		Given User launches website
		When  User click on signin link
		And   User provides "valid" login credentials
		Then  User should be able to login successfully on Submit
		And   User captures screenshot and embeds in report 
		Then  User Clicks on SignOut from MyAccount Home Page

Scenario: User_login_with_InValid_credentials

		Given User launches website
		When  User click on signin link
		And   User provides "invalid" login credentials
		Then  User should be able to see error message on Screen at Submit
		And   User captures screenshot and embeds in report 

Scenario: New_user_creates_account

		Given User launches website
		When  User click on signin link
		And   User provides email address to create new account
		Then  User click on create an account button
		Then  User provides details for creating new user
		Then  User should be able to create account successfully on clicking Register

Scenario: Registered_user_logouts_from_MyAccount_Page

		Given User launches website
		When  User click on signin link
		And   User provides "valid" login credentials
		Then  User should be able to login successfully on Submit
		Then  User Clicks on SignOut from MyAccount Home Page

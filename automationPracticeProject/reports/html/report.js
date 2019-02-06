$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("User_Login_Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality for automationPractice site",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 172070,
  "status": "passed"
});
formatter.before({
  "duration": 3156439743,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Registered_user_login_with_valid_credentials",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site;registered-user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User provides \"valid\" login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be able to login successfully on Submit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User captures screenshot and embeds in report",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Clicks on SignOut from MyAccount Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_Firefox_And_Launch_Application()"
});
formatter.result({
  "duration": 7586424671,
  "status": "passed"
});
formatter.match({
  "location": "Login.signIn()"
});
formatter.result({
  "duration": 1916999131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 15
    }
  ],
  "location": "Login.enter_Login_Credentials(String)"
});
formatter.result({
  "duration": 760871451,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Submit_Button_Success()"
});
formatter.result({
  "duration": 1800939785,
  "status": "passed"
});
formatter.match({
  "location": "Login.capture_Screenshot()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 369111731,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount_Home.click_SignOut()"
});
formatter.result({
  "duration": 2080197834,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 881159356,
  "status": "passed"
});
formatter.before({
  "duration": 42335,
  "status": "passed"
});
formatter.before({
  "duration": 2556157919,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User_login_with_InValid_credentials",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site;user-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User launches website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User provides \"invalid\" login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should be able to see error message on Screen at Submit",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User captures screenshot and embeds in report",
  "keyword": "And "
});
formatter.match({
  "location": "Login.open_Firefox_And_Launch_Application()"
});
formatter.result({
  "duration": 6118887209,
  "status": "passed"
});
formatter.match({
  "location": "Login.signIn()"
});
formatter.result({
  "duration": 1751474595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 15
    }
  ],
  "location": "Login.enter_Login_Credentials(String)"
});
formatter.result({
  "duration": 198397084,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Submit_Button_Failure()"
});
formatter.result({
  "duration": 1382748322,
  "status": "passed"
});
formatter.match({
  "location": "Login.capture_Screenshot()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 337825296,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 861002807,
  "status": "passed"
});
formatter.before({
  "duration": 30192,
  "status": "passed"
});
formatter.before({
  "duration": 2526309673,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "New_user_creates_account",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site;new-user-creates-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User launches website",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User provides email address to create new account",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User provides details for creating new user",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User should be able to create account successfully on clicking Register",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_Firefox_And_Launch_Application()"
});
formatter.result({
  "duration": 6641344892,
  "status": "passed"
});
formatter.match({
  "location": "Login.signIn()"
});
formatter.result({
  "duration": 1751760404,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_email_NewAccount()"
});
formatter.result({
  "duration": 101847013,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_NewAccount_Button_()"
});
formatter.result({
  "duration": 253045925,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_NewUser_Details()"
});
formatter.result({
  "duration": 3659565388,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Reigster_Button()"
});
formatter.result({
  "duration": 3319158289,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 873861841,
  "status": "passed"
});
formatter.before({
  "duration": 30655,
  "status": "passed"
});
formatter.before({
  "duration": 2360584958,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Registered_user_logouts_from_MyAccount_Page",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site;registered-user-logouts-from-myaccount-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "User launches website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User provides \"valid\" login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should be able to login successfully on Submit",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User Clicks on SignOut from MyAccount Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_Firefox_And_Launch_Application()"
});
formatter.result({
  "duration": 8945285624,
  "status": "passed"
});
formatter.match({
  "location": "Login.signIn()"
});
formatter.result({
  "duration": 2545538434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 15
    }
  ],
  "location": "Login.enter_Login_Credentials(String)"
});
formatter.result({
  "duration": 187577992,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Submit_Button_Success()"
});
formatter.result({
  "duration": 2033738293,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount_Home.click_SignOut()"
});
formatter.result({
  "duration": 2630201949,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 833347931,
  "status": "passed"
});
});
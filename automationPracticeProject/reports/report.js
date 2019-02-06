$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("User_Login_Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality for automationPractice site",
  "description": "",
  "id": "test-login-functionality-for-automationpractice-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 103926,
  "status": "passed"
});
formatter.before({
  "duration": 3036937206,
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
  "duration": 8195763940,
  "status": "passed"
});
formatter.match({
  "location": "Login.signIn()"
});
formatter.result({
  "duration": 2087385132,
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
  "duration": 782975291,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Submit_Button_Success()"
});
formatter.result({
  "duration": 1720347147,
  "status": "passed"
});
formatter.match({
  "location": "Login.capture_Screenshot()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 377264290,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount_Home.click_SignOut()"
});
formatter.result({
  "duration": 2134343561,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 838005705,
  "status": "passed"
});
});
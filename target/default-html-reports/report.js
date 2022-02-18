$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "When user logs in with valid credentials, Account Summary page should be displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"username\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_logs_in_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Account Summary\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "When user try to log in with blank username or password error message needs to be displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative_scenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_logs_in_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Login and/or password are wrong.\" error message needs to be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.error_message_needs_to_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "When user try to log in with invalid credentials error message needs to be displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative_scenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"invalid\" and password \"invalid password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_logs_in_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Login and/or password are wrong.\" error message needs to be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.error_message_needs_to_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
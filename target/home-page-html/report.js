$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/koofr/feature/Koofr.feature");
formatter.feature({
  "name": "Koofr Upload Document Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a new folder and upload two documents",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to koofr login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automatedtest.steps.KoofrTestSteps.i_navigate_to_koofr_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address in email field with \"amitpande1899@gmail.com\" and password with \"chiki3939\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automatedtest.steps.KoofrTestSteps.enterCredential(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a new folder \"Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.automatedtest.steps.KoofrTestSteps.i_create_a_new_folder_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload \"2\" documents, \"MobileBill.pdf\" and \"ElectricityBill.pdf\" into the new folder successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automatedtest.steps.KoofrTestSteps.i_upload_something_documents_something_and_something_into_the_new_folder_successfully(int,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
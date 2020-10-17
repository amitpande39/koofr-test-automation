package com.automatedtest.steps;

import com.automatedtest.pages.HomePage;
import com.automatedtest.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KoofrTestSteps {

    private LoginPage loginPage;
    private HomePage homePage;

    public KoofrTestSteps() {
        this.loginPage = new LoginPage();
        this.homePage = new HomePage();
    }

    @Given("^I navigate to koofr login page$")
    public void i_navigate_to_koofr_login_page() throws Throwable {
        this.loginPage.goToLoginPage();
    }

    @When("^I enter email address in email field with \"([^\"]*)\" and password with \"([^\"]*)\"$")
    public void enterCredential(String email, String password) throws Throwable {
        this.loginPage.login(email, password);
        this.homePage.validateHomePage();
    }

    @And("^I create a new folder \"([^\"]*)\"$")
    public void i_create_a_new_folder_something(String folderName) throws Throwable {
        this.homePage.createNewFolder(folderName);
        this.homePage.openFolder();
    }

    @Then("^I upload \"([^\"]*)\" documents, \"([^\"]*)\" and \"([^\"]*)\" into the new folder successfully$")
    public void i_upload_something_documents_something_and_something_into_the_new_folder_successfully(int numOfDocuments,String mobileBill,String electricityBill) throws Throwable {
        this.homePage.uploadFile(mobileBill);
        this.homePage.uploadFile(electricityBill);
        this.homePage.validateUploadedDocuments(numOfDocuments);
        this.homePage.cleanUp();
    }
}

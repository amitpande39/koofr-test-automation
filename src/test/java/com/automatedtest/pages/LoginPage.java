package com.automatedtest.pages;
import com.automatedtest.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement enterEmail;

    @FindBy(id = "password")
    private WebElement enterPassword;

    @FindBy(css = "button[type='submit']")
    private WebElement signIn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage() {
        driver.get(helper.readConfigFile("baseURL"));
    }

    public void login(String email, String password) throws InterruptedException {
        enterEmail.sendKeys(email);
        enterPassword.sendKeys(password);
        signIn.click();
    }
}

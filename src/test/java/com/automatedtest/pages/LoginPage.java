package com.automatedtest.pages;
import com.automatedtest.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(css = "dropbox-logo__link")
    private WebElement dropBoxLogo;

    @FindBy(linkText = "log in")
    private WebElement loginLink;

    @FindBy(id = "email")
    private WebElement enterEmail;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement signIn;

    @FindBy(className = "l-navbar-nav-item--add")
    private WebElement addButton;

    @FindBy(css = "button[type='submit']")
    private WebElement createFolder;

    @FindBy(className = "text-input")
    private WebElement folderNameInput;

    @FindBy(className = "button--primary")
    private WebElement clickCreateFolderButton;

    @FindBy(className = "l-menu__text")
    private List<WebElement> optionMenu;

    @FindBy(css = "div.l-menu__text")
    private List<WebElement> optionsList;

    @FindBy(className = "l-app-content")
    private WebElement modalTitle;

    @FindBy(css = ".l-files-table__file-name a")
    private WebElement doc;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage() {
        driver.get(helper.readConfigFile("baseURL"));
    }

    public void login(String email, String password) throws InterruptedException {
        this.enterEmail.sendKeys(email);
        this.password.sendKeys(password);
        this.signIn.click();
    }

}

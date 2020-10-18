package com.automatedtest.pages;

import com.automatedtest.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HomePage  extends BasePage {

    @FindBy(css = ".l-user-icon")
    private WebElement userIcon;

    @FindBy(css = ".l-navbar-nav-item--add")
    private WebElement addButton;

    @FindBy(css = "button[type='submit']")
    private WebElement createFolder;

    @FindBy(css = ".text-input")
    private WebElement folderNameInput;

    @FindBy(css = "div.l-menu__text")
    private List<WebElement> optionsList;

    @FindBy(css = ".l-app-content")
    private WebElement modalTitle;

    @FindBy(css = ".l-files-table__file-name a")
    private WebElement folder;

    @FindBy(css = ".l-files-upload-form__file-input")
    private WebElement uploadElement;

    @FindBy(css = ".l-files-table__file-name")
    private List<WebElement> uploadedDoc;

    @FindBy(css = ".l-dashboard-sidenav__menu-item--hosted")
    private WebElement selectKoofr;

    @FindBy(css = ".l-table__head-checkbox")
    private WebElement tableHeadCheckbox;

    @FindBy(css = ".l-toolbar__item--delete")
    private WebElement deleteButton;

    @FindBy(css = ".l-modal__title")
    private WebElement deleteModalTitle;

    @FindBy(css = ".l-kbox__primary-button")
    private WebElement confirmDelete;

    @FindBy(css = ".l-files-table__file-name-link")
    private WebElement folderName;

    @FindBy(css = "div.l-table__body >div:nth-child(2)")
    private WebElement secondUploadedDoc;

    @FindBy(css = ".l-files-error__text")
    private WebElement emptyFolderText;

    @FindBy(css = ".l-dashboard-navbar-profile__img")
    private WebElement profileImage;

    @FindBy(css = ".l-form__button")
    private WebElement signInButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    private void selectActionFromMenu(String action) {
        for (WebElement webElement : optionsList) {
            if (webElement.getText().equals(action)) {
                webElement.click();
                break;
            }
        }
    }

    public void validateHomePage() {
        Assert.assertEquals(true, this.userIcon.isDisplayed());
    }

    public void createNewFolder(String folderName) {
        addButton.click();
        selectActionFromMenu("Create folder");
        modalTitle.getText().equalsIgnoreCase("Enter new folder name");
        folderNameInput.clear();
        folderNameInput.sendKeys(folderName + Keys.TAB);
        createFolder.click();
        folder.getText().equalsIgnoreCase(folderName);
    }

    public void openFolder() {
        this.folder.click();
    }

    private String getPath() {
        File file = new File(helper.readConfigFile("documentPath"));
        return file.getAbsolutePath();
    }

    public void uploadFile(String docName) {
        addButton.click();
        selectActionFromMenu("Upload file");
        uploadElement.sendKeys(getPath() + "/" + docName);
    }

    public void cleanUp() {
        selectKoofr.click();
        helper.waitForElementToDisplay(this.folderName, "Folder Name");
        tableHeadCheckbox.click();
        deleteButton.click();
        helper.waitForElementToDisplay(this.deleteModalTitle, "Delete Modal Pop-up");
        confirmDelete.click();
        helper.waitForElementToDisplay(this.emptyFolderText,"Element to Assert Deletion");
        Assert.assertEquals("This folder is empty.",this.emptyFolderText.getText());
        logout();
    }

    private void logout() {
        profileImage.click();
        selectActionFromMenu("Sign out");
        helper.waitForElementToDisplay(this.signInButton,"SignIn Button");
        Assert.assertEquals("Sign In",this.signInButton.getText());
    }

    public void validateUploadedDocuments(int numOfDocuments) {
        selectKoofr.click();
        folderName.click();
        helper.waitForElementToDisplay(this.secondUploadedDoc, "second doc");
        Assert.assertEquals(numOfDocuments, getDocumentList().size());
    }

    private List<String> getDocumentList() {
        List<String> docList = new ArrayList<>();
        for (WebElement webElement : uploadedDoc) {
            docList.add(webElement.getText());
        }
        return docList;
    }
}

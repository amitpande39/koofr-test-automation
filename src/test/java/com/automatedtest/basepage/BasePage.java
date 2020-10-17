package com.automatedtest.basepage;

import com.automatedtest.infrastructure.driver.Setup;
import com.automatedtest.infrastructure.driver.Helper;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Helper helper;

    public BasePage() {
        this.driver = Setup.driver;
        this.helper = new Helper(this.driver);
    }
}
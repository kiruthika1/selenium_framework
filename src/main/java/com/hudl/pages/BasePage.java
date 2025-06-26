package com.hudl.pages;
import com.hudl.driver.DriverManager;

public class BasePage {

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}

package com.hudl.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hudl.driver.DriverManager;

public class LoginPageTests extends BaseTest{

    private LoginPageTests(){}

    @Test
    public void test1() {
        DriverManager.getDriver().findElement(By.linkText("Log in")).click();
    }
}

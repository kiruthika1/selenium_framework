package com.hudl.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hudl.driver.Driver;

public class BaseTest {

    protected BaseTest(){}

    @BeforeMethod
    protected void setUp(Object[] data) {
        Driver.initDriver();
    }

    @AfterMethod
    protected void tearDown() {
        Driver.quitDriver();
    }
}

package com.hudl.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.hudl.driver.DriverManager;


public class HomePageTests extends BaseTest {
    private HomePageTests(){}

    @Test
    public void test2() {
       DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

}

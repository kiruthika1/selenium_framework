package com.hudl.driver;

import java.util.Objects;

import com.hudl.constants.FrameworkConstants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private Driver(){}

    public static void initDriver()  {

        if(Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-cookies");
            DriverManager.setDriver(new ChromeDriver(options));
            DriverManager.getDriver().get("https://www.hudl.com/en_gb/");
            DriverManager.getDriver().manage().window().maximize();
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

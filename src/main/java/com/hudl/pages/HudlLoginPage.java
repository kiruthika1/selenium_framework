package com.hudl.pages;

import com.hudl.driver.DriverManager;
import org.openqa.selenium.By;

public class HudlLoginPage extends BasePage {

        private By txtUsername=By.xpath("//input[@id='username']");
        private By btnContinue=By.xpath("//button[@type='submit' and text()='Continue']");
        private By txtPassword=By.xpath("//input[@id='password']");


        public void sendUsername(){
            DriverManager.getDriver().findElement(txtUsername).sendKeys("kiruthila.ganesan@gmail.com");
        }

    public void flowContinue(){
      // DriverManager.getDriver().findElement(btnContinue).isEnabled();
        DriverManager.getDriver().findElement(btnContinue).click();
    }

    public void sendPassword(){
        DriverManager.getDriver().findElement(txtPassword).sendKeys("PASSWORD");
    }


}

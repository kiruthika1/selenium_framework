package com.hudl.pages;

import com.hudl.driver.DriverManager;
import org.openqa.selenium.By;

public class HudlHomePage extends BasePage{
    private By linkLogin=By.linkText("Log in");
    private By rejectAll=By.xpath("//button[@id='onetrust-reject-all-handler']");
    private By txtHudl0=By.xpath("//a[text()='Hudl']");
    private By txtHudl=By.xpath("//a[@class='subnav__item subnavitem subnavitem--icon']");


    public void clickLogin(){
        DriverManager.getDriver().findElement(linkLogin).click();
        String Title0= DriverManager.getDriver().getTitle();
        System.out.println("Home page:"+Title0);
    }
    public void rejectAllCookies() {
        DriverManager.getDriver().findElement(rejectAll).isEnabled();
        DriverManager.getDriver().findElement(rejectAll).click();
        String Title1= DriverManager.getDriver().getTitle();
        System.out.println("Home page:"+Title1);
    }

    public void clickHudlLink(){
        DriverManager.getDriver().findElement(txtHudl).click();
        String Title2= DriverManager.getDriver().getTitle();
        System.out.println("Home page:"+Title2);
    }
}

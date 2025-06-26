package com.hudl.tests;

import com.hudl.pages.HudlHomePage;
import com.hudl.pages.HudlLoginPage;
import org.testng.annotations.Test;

public class HudlLoginTests extends BaseTest{

    private HudlLoginTests(){}

    @Test
    public void loginTest(){
        HudlHomePage hhp = new HudlHomePage();
        HudlLoginPage hlp = new HudlLoginPage();
       // hhp.rejectAllCookies();
        hhp.clickLogin();
        hhp.clickHudlLink();
        hlp.sendUsername();
        hlp.flowContinue();
        hlp.sendPassword();
        hlp.flowContinue();
    }

}

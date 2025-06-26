package com.hudl.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    private static final int EXPLICITWAIT = 10;
    private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
    private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
    private static final String CHROMEDRIVERPATH = RESOURCESPATH+"/executables/chromedriver.exe";

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }

}
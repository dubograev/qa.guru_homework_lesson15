package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getWebUrl() {
        return getWebConfig().webUrl();
    }

    public static String getWebBrowser() {
        return getWebConfig().webBrowser();
    }

    public static String getWebBrowserScreenResolution() {
        return getWebConfig().webBrowserScreenResolution();
    }

    public static String getWebMobileDevice() {
        return getWebConfig().webMobileDevice();
    }

    public static String getWebRemoteDriver() {
        return getWebConfig().webRemoteDriver();
    }

    public static String getWebVideoStorage() {
        return getWebConfig().webVideoStorage();
    }

    private static WebConfig getWebConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "prod"); // stage, preprod

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}

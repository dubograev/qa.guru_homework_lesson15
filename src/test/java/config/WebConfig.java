package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/${environment}.properties"
})
public interface WebConfig extends Config {
    @Key("web.url")
    String webUrl();

    @Key("web.browser")
    String webBrowser();

    @Key("web.browser.screen.resolution")
    String webBrowserScreenResolution();

    @Key("web.mobile.device")
    String webMobileDevice();

    @Key("web.remote.driver")
    String webRemoteDriver();

    @Key("web.video.storage")
    String webVideoStorage();
}

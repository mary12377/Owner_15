package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${config}.properties",
        "classpath:config/local.properties"
})
public interface BrowserConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    @DefaultValue("91.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    @DefaultValue("https://doramalive.ru/")
    String baseUrl();

    String selenoidUrl();
}

package config;
import org.aeonbits.owner.Config;

import java.net.URL;

//@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${go}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("101.0")
    String getBrowserVersion();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();


}
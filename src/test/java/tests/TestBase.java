package tests;

import config.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;



import static com.codeborne.selenide.Selenide.open;
import static java.util.Objects.*;

public class TestBase {

    @BeforeAll
    public static void setUp() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        String baseUrlString = System.getProperty("baseUrl");
        isNull(baseUrlString);
        baseUrlString = "https://google.com";
        open(baseUrlString);
        if (!webConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webConfig.getRemoteWebDriver();
        }
    }
}
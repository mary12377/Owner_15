package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:config/auth.properties"
})
public interface ProjectConfig extends Config {
      String login();

     String password();
}

package qa.guru.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();
    @Key("remoteURL")
    @DefaultValue("http://localhost:4444")
    String getRemoteURL();

}

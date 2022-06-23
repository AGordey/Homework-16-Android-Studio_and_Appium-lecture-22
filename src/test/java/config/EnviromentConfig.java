package config;

import org.aeonbits.owner.Config;

@Config.Sources ({
      "classpath:${deviceHost}.properties"
})
public interface EnviromentConfig extends Config {

    @Key("DeviceName")
    @DefaultValue("Google Pixel 3")
    String DeviceName();

    @Key("AndroidVersion")
    @DefaultValue("9.0")
    String AndroidVersion();

    @Key("HostUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String HostUrl();
}

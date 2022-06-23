package config;

import org.aeonbits.owner.Config;

@Config.Sources ({
      "classpath:${deviceHost}.properties"
})
public interface EnviromentConfig extends Config {

    @Key("DeviceName")
    @DefaultValue("Google Pixel 3")
    String DeviceName();

    @Key("PlatformVersion")
    @DefaultValue("9.0")
    String PlatformVersion();

    @Key("HostUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String HostUrl();
}
